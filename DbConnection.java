/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


class DbConnection {
    Connection con = null;

    Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","srabs");      
        return con;
    }
    
}
