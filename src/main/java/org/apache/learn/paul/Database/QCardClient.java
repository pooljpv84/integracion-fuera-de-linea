package org.apache.learn.paul.Database;

import org.apache.learn.paul.DTO.Client;
import org.slf4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QCardClient
{
    public String dropTable()
    {
        String sql= "DROP TABLE IF EXISTS cardclient; CREATE TABLE IF NOT EXISTS cardclient ( ID                         INTEGER  NOT NULL PRIMARY KEY"
                +
                ",LIMIT_BAL                  INTEGER  NOT NULL" +
                ",SEX                        INTEGER  NOT NULL" +
                ",EDUCATION                  INTEGER  NOT NULL" +
                ",MARRIAGE                   INTEGER  NOT NULL" +
                ",AGE                        INTEGER  NOT NULL" +
                ",PAY_0                      INTEGER  NOT NULL" +
                ",PAY_2                      INTEGER  NOT NULL" +
                ",PAY_3                      INTEGER  NOT NULL" +
                ",PAY_4                      INTEGER  NOT NULL" +
                ",PAY_5                      INTEGER  NOT NULL" +
                ",PAY_6                      INTEGER  NOT NULL" +
                ",BILL_1                     INTEGER  NOT NULL" +
                ",BILL_2                     INTEGER  NOT NULL" +
                ",BILL_3                     INTEGER  NOT NULL" +
                ",BILL_4                     INTEGER  NOT NULL" +
                ",BILL_5                     INTEGER  NOT NULL" +
                ",BILL_6                     INTEGER  NOT NULL" +
                ",PAYV_1                      INTEGER  NOT NULL" +
                ",PAYV_2                      INTEGER  NOT NULL" +
                ",PAYV_3                      INTEGER  NOT NULL" +
                ",PAYV_4                      INTEGER  NOT NULL" +
                ",PAYV_5                      INTEGER  NOT NULL" +
                ",PAYV_6                      INTEGER  NOT NULL" +
                ",default_payment_next_month INTEGER  NOT NULL);";
        return sql;
    }

    public void insertClient(ConectarBDD connection, Client client, Logger log, BufferedWriter writeSuccess) throws SQLException, IOException {

        String sql = "INSERT INTO cardclient(ID,LIMIT_BAL,SEX,EDUCATION,MARRIAGE,AGE,PAY_0,PAY_2,PAY_3,PAY_4,PAY_5,PAY_6,BILL_1,BILL_2,BILL_3,BILL_4,BILL_5,BILL_6,PAYV_1,PAYV_2,PAYV_3,PAYV_4,PAYV_5,PAYV_6,default_payment_next_month) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement statement = connection.getConexion().prepareStatement(sql);
        statement.setInt(1, client.getId());
        statement.setInt(2, client.getLimitBalance());
        statement.setInt(3, client.getSex());
        statement.setInt(4, client.getEducation());
        statement.setInt(5, client.getMarriage());
        statement.setInt(6, client.getAge());
        statement.setInt(7, client.getPay0());
        statement.setInt(8, client.getPay2());
        statement.setInt(9, client.getPay3());
        statement.setInt(10, client.getPay4());
        statement.setInt(11, client.getPay5());
        statement.setInt(12, client.getPay6());
        statement.setInt(13, client.getBill1());
        statement.setInt(14, client.getBill2());
        statement.setInt(15, client.getBill3());
        statement.setInt(16, client.getBill4());
        statement.setInt(17, client.getBill5());
        statement.setInt(18, client.getBill6());
        statement.setInt(19, client.getPayv1());
        statement.setInt(20, client.getPayv2());
        statement.setInt(21, client.getPayv3());
        statement.setInt(22, client.getPayv4());
        statement.setInt(23, client.getPayv5());
        statement.setInt(24, client.getPayv6());
        statement.setInt(25, client.getDefaultPaymentNextMonth());
        statement.executeUpdate();
        writeSuccess.write("Exito Pago: Cliente con ID: " + client.getId());
        writeSuccess.newLine();
        log.info("Exito en pago: {} cliente ID: {}", client.getAge(), client.getId());
    }
}
