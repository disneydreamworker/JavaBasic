package day16.homework.dao;

import day16.homework.dto.MemberVo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberDao extends MemberVo {

  final String url = "jdbc:mysql://localhost:3306/employees";
  final String userName = "root";
  final String password = "0000";

  boolean connection;
  Connection con = null;
  PreparedStatement pstmt = null;
  Statement stmt = null;
  ResultSet rs = null;

  public MemberDao() {
  }

  public MemberDao(int id, String name, String job) {
    super();
    this.id = id;
    this.name = name;
    this.job = job;
  }

  private boolean connectDB() {
    try {
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      return true;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void memberInsert() {
    String query = "INSERT INTO member VALUES(?,?,?)";
    connection = connectDB();

    if (connection) {
      try {
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, this.id);
        pstmt.setString(2, this.name);
        pstmt.setString(3, this.job);

        if (pstmt.executeUpdate() == 1) {
          System.out.println("회원 정보가 입력되었습니다.");
        } else {
          System.out.println("회원 정보 입력이 실패하였습니다.");
        }
        pstmt.close();
        con.close();
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }
  }

  @Override
  public void memberSearch() {
    String query = "SELECT * FROM member";
    connection = connectDB();

    if (connection) {
      try {
        stmt = con.createStatement();
        rs = stmt.executeQuery(query);
        while (rs.next()) {
          int id = rs.getInt("id");
          String name = rs.getString("name");
          String job = rs.getString("job");
          System.out.printf("id : %d name : %s  job : %s", id, name, job);
          System.out.println();
        }
        rs.close();
        stmt.close();
        con.close();
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }
  }

  @Override
  public void memberUpdate(String job, int id) {
    String query = "UPDATE member SET job = ? where id = ? ";
    connection = connectDB();
    if (connection) {
      try {
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, job);
        pstmt.setInt(2, id);

        if (pstmt.executeUpdate() == 1) {
          System.out.println("회원 정보가 완전 잘 수정 되었습니다.");
        } else {
          System.out.println("회원 정보 수정이 실패하였습니다.");
        }

        pstmt.close();
        con.close();
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }
  }

  @Override
  public void memberDelete(int id) {
    String query = "DELETE FROM member where id = ? ";
    connection = connectDB();
    if (connection) {
      try {
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, id);

        if (pstmt.executeUpdate() == 1) {
          System.out.println("회원 정보가 완전 잘 수정 되었습니다.");
        } else {
          System.out.println("회원 정보 수정이 실패하였습니다.");
        }
        pstmt.close();
        con.close();
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
