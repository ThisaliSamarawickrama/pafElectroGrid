package net.codejava.ws;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    
        private static String url="jdbc:mysql://localhost:3306/electrogrid?autoReconnect=true&useSSL=false";
        private static String user="root";
        private static String pass="nadun1459@"; 
        private static Connection con;
                
        public static Connection connectDB(){
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                con=DriverManager.getConnection(url, user, pass);
                System.out.println("Connetion success");
            }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
                System.out.println(e.getMessage());
            }
            return con;
            
        }
}



