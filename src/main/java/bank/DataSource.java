package bank;
import java.sql.Connection;
//This class handljes conection to the DataBase 
//as well as reading and writting from and into it
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
  
  public static Connection connect(){
    String db_file="jdbc:sqlite:resources/bank.db";
    Connection connection=null;

    try{
      connection= DriverManager.getConnection(db_file);
      System.out.println("Connected");
    }
    catch(SQLException e){
      e.printStackTrace();
    }
    return connection;

  }
 public static void main(String[] args){
  connect();
 }
}
