package day17.dbEX.vo;

import day17.dbEX.dbconf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelectAllUser {

  static Connection connection = null;
  static ResultSet rs = null;
  static ArrayList<User> userlist = new ArrayList<>();

  public static void main(String[] args) {

    String query = "select * from users";

    Connection connection = ConnectionFactory.getConnectionFactory();

    try {
      PreparedStatement psmt = connection.prepareStatement(query);

    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }
}
