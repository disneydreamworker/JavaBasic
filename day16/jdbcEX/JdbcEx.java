package day16.jdbcEX;

import java.awt.JobAttributes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.Name;

public class JdbcEx {

  static String url = "jdbc:mysql://localhost:3306/employees";
  static String userName = "root";
  static String password = "0000";

  public static void main(String[] args) {
    mySqlConnection();
  }
  public static void mySqlConnection() {
    String query = "SELECT * FROM member";
    try {
      Connection con = DriverManager.getConnection(url,userName,password); //3306 포트로 가기 위한 연결을 요청하는 Connection 객체! 도로를 만들어준다.
      Statement stmt = con.createStatement(); //쿼리문을 담을 자동차 객체 생성 -> 이 자동차가 mysql 3306 포트로 이동하며 쿼리문을 나른다!
      //자바에서는 쿼리문의 결과를 resultset 객체로 받는다. 약속임.
      ResultSet rs = stmt.executeQuery(query);
      while(rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String job = rs.getString("job");
        System.out.println(id + "\t" + name + "\t" + job);
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
