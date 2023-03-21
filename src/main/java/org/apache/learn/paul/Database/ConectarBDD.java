package org.apache.learn.paul.Database;

import org.apache.learn.paul.ProcessorClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarBDD {

    private Connection conexion;
    public Logger log = LoggerFactory.getLogger(ProcessorClient.class);

    public ConectarBDD(String nombreBaseDatos) {
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:" + nombreBaseDatos);
            log.info("Conexión establecida");
        } catch (Exception e) {
            log.info("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void desconectar() {
        try {
            conexion.close();
            log.info("Conexión cerrada");
        } catch (Exception e) {
            log.info("Error al cerrar la conexión: " + e.getMessage());
        }
    }

}
