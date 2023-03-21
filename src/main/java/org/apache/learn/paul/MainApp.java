package org.apache.learn.paul;

import org.apache.camel.main.Main;
import org.apache.learn.paul.Database.ConectarBDD;
import org.apache.learn.paul.Database.QCardClient;

import java.sql.Connection;
import java.sql.Statement;

/**
 * A Camel Application
 */
public class MainApp {


    public static void main(String... args) throws Exception {
        //bdd
        Connection conn = null;
        Statement statement = null;
        ConectarBDD conection = new ConectarBDD("src/data/datos.db");
        QCardClient query = new QCardClient();
        //operaciones
        conn = conection.getConexion();
        statement = conn.createStatement();
        statement.executeUpdate(query.dropTable());
        //Main
        Main main = new Main();
        main.configure().addRoutesBuilder(new MyRouteBuilder());
        main.run(args);
        //cerrar conexion
        conection.desconectar();
    }

}

