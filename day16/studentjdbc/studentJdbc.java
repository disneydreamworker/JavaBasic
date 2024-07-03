package day16.studentjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class studentJdbc {

  static final String url = "jdbc:mysql://localhost:3306/employees";
  static final String userName = "root";
  static final String password = "0000";

  static Connection con = null;
  static Statement stmt = null;
  static ResultSet rs = null;
  static Scanner sc = new Scanner(System.in);

  static String sno;
  static String name;
  static int korean;
  static int english;
  static int math;
  static int science;
  static int total;
  static float average;
  static String grade;

  public static void getConnection() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(url, userName, password);
    stmt = con.createStatement();
  }

  public static void getRecords() {
    String query = "select * from student";

    try {
      rs = stmt.executeQuery(query);

      while (rs.next()) {
        sno = rs.getString(1);
        name = rs.getString(2);
        korean = rs.getInt(3);
        english = rs.getInt(4);
        math = rs.getInt(5);
        science = rs.getInt(6);
        total = rs.getInt(7);
        average = rs.getFloat(8);
        grade = rs.getString(9);

        System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n", sno, name, korean, english,
            math, science, total, average, grade);
      }
      rs.close();
      stmt.close();
      con.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void insertRecords() {
    System.out.println("입력해주세요.");
    sno = sc.nextLine();
    name = sc.nextLine();
    korean = Integer.parseInt(sc.nextLine());
    english = Integer.parseInt(sc.nextLine());
    math = Integer.parseInt(sc.nextLine());
    science = Integer.parseInt(sc.nextLine());
    total = korean + english + math + science;
    average = (float) total / 4;
    if (average >= 90) {
      grade = "A";
    } else if (average < 90 && average >= 80) {
      grade = "B";
    } else if (average < 80 && average >= 70) {
      grade = "C";
    } else {
      grade = "D";
    }
    System.out.println("입력이 끝났습니다. 쿼리를 실행합니다.");

    String query =
        "insert into student values(" + sno + "," + name + "," + korean + "," + english + "," + math
            + "," + science + "," + total + "," + average + "," + grade + ");";

    try {
      rs = stmt.executeQuery(query);

      while (rs.next()) {
        String sno = rs.getString(1);
        String name = rs.getString(2);
        int korean = rs.getInt(3);
        int english = rs.getInt(4);
        int math = rs.getInt(5);
        int science = rs.getInt(6);
        int total = rs.getInt(7);
        float average = rs.getFloat(8);
        String grade = rs.getString(9);

        System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n", sno, name, korean, english,
            math, science, total, average, grade);
      }
      rs.close();
      stmt.close();
      con.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void updateRecords() {
    System.out.println("학생 테이블을 수정합니다.");
    sno = sc.nextLine();
    name = sc.nextLine();
    korean = Integer.parseInt(sc.nextLine());
    english = Integer.parseInt(sc.nextLine());
    math = Integer.parseInt(sc.nextLine());
    science = Integer.parseInt(sc.nextLine());
    total = korean + english + math + science;
    average = (float) total / 4;
    if (average >= 90) {
      grade = "A";
    } else if (average < 90 && average >= 80) {
      grade = "B";
    } else if (average < 80 && average >= 70) {
      grade = "C";
    } else {
      grade = "D";
    }
    System.out.println("입력이 끝났습니다. 쿼리를 실행합니다.");

    String query =
        "insert into student values(" + sno + "," + name + "," + korean + "," + english + "," + math
            + "," + science + "," + total + "," + average + "," + grade + ");";

    try {
      rs = stmt.executeQuery(query);

      while (rs.next()) {
        String sno = rs.getString(1);
        String name = rs.getString(2);
        int korean = rs.getInt(3);
        int english = rs.getInt(4);
        int math = rs.getInt(5);
        int science = rs.getInt(6);
        int total = rs.getInt(7);
        float average = rs.getFloat(8);
        String grade = rs.getString(9);

        System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n", sno, name, korean, english,
            math, science, total, average, grade);
      }
      rs.close();
      stmt.close();
      con.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    getConnection();
    getRecords();
  }
}
