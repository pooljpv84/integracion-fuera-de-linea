package org.apache.learn.paul;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.learn.paul.DTO.Client;
import org.apache.learn.paul.Database.ConectarBDD;
import org.apache.learn.paul.Database.QCardClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessorClient implements Processor
{
    Logger log = LoggerFactory.getLogger(ProcessorClient.class);

    @Override
    public void process(Exchange exchange) throws Exception
    {
        Connection connection = null;
        ConectarBDD conn = new ConectarBDD("src/data/datos.db");
        QCardClient query = new QCardClient();
        File logFile = new File("src/data/logErrores.txt");
        File successFile = new File("src/data/logAprobados.txt");

        loadFiles(logFile);
        loadFiles(successFile);
        try
        {

            FileWriter fileLog = new FileWriter(logFile, true);
            BufferedWriter writeLog = new BufferedWriter(fileLog);

            FileWriter fileSuccess = new FileWriter(successFile, true);
            BufferedWriter writeSuccess = new BufferedWriter(fileSuccess);

            connection = conn.getConexion();
            ArrayList<Client> list = (ArrayList) exchange.getIn().getBody();
            int countError = 0;
            int countSuccess = 0;
            for (Client client : list) {
                if (client.getBill1() <= 0 && client.getPayv1() <= 0) {
                    writeLog.write("Error Pago: Cliente con ID: " + client.getId());
                    writeLog.newLine();
                    log.info("Error Pago: Cliente con ID: {}", +client.getId());
                    countError++;
                } else {
                    countSuccess++;
                    query.insertClient(conn,client,log,writeSuccess);
                }
            }
            writeLog.close();
            writeSuccess.close();
            log.info("Se encontraron {} clientes con problemas y {} clientes con pagos exitosos", countError, countSuccess);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
    }

    private void loadFiles(File file)
    {
        try {
            if (file.exists()) {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write("");
                fileWriter.close();
            } else {
                file.createNewFile();
            }
        } catch (IOException e) {
            log.info(e.getMessage());
        }
    }
}