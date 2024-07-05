package day17.dbEX.dbconf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Singleton
public class ConnectionFactory {

  //1
  private static final ConnectionFactory instance = new ConnectionFactory();
  private static final String url = "jdbc:mysql://localhost:3306/ssgdatabase";
  private static final String root = "root";
  private static final String pwd = "0000";
  private static Connection connection = null;

  //2
  private ConnectionFactory() {
  }

  //3
  public static ConnectionFactory getInstance() {
    return instance;
  }

  public static Connection getConnectionFactory() {
    return connection;
  }

  public boolean open() {
    boolean open = false;

    try {
      connection = DriverManager.getConnection(url, root, pwd);
      open = true;
      return open;
    } catch (SQLException e) {
      System.err.println(e.getMessage());

      if (connection == null) {
        System.out.println("Connection이 실패했습니다. 프로그램을 종료합니다.");
      }
      return open;
    }
  }


  public boolean close() {
    boolean close = false;
    try {
      connection.close();
      close = true;
      return close;
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      System.out.println("Connection 종료가 실패했습니다. 프로그램을 종료합니다.");
    }
    return close;
  }


}
