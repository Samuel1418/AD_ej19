/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio19;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author oracle
 */
public class Exercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
      Producto obj= new Producto();
      obj.conectar();
     // obj.insertarFila("p4", "cinta", 2);
     // obj.borrarFila("p4");
      obj.verLista();
      
    }
    
}
