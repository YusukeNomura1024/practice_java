import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSaveSample {

  private static final String DRIVER = "com.mysql.jdbc.Driver";

  private static final String URL = "jdbc:mysql://localhost:3306/database01?user=user01&password=password01&useSSL=false";

  public static void main(String[] args) throws ClassNotFoundException {

    try {
      // com.mysql.cj.jdbc.Driverクラスをロードして、初期化処理を行う
      Class.forName(DRIVER);
    } catch (ClassNotFoundException e) {
      // ドライバのクラスがクラスパスに見つからなかった場合にClassNotFoundExceptionが発生します。
      e.printStackTrace();
      // ドライバが見つからない場合は、後続の処理を続行できませんので、例外をthrowして処理を中断します。
      throw e;
    }

    // Connection（データベースとの接続を表す）、PreparedStatement（発行するSQLを表す）を、それぞれ生成します。
    try (Connection connection = DriverManager.getConnection(URL);
        PreparedStatement statement = connection.prepareStatement("insert into user (email, name) values (?, ?)")) {

      statement.setString(1, "aaa@aaa.aaa");
      statement.setString(2, "taro");
      statement.execute();

      // try (ResultSet resultSet = statement.executeQuery()) {

      // // SQLの実行結果はidが1だけを取り出している
      // while (resultSet.next()) {
      // System.out.println("----------------------");
      // System.out.println(resultSet.getLong("id"));
      // System.out.println(resultSet.getString("email"));
      // System.out.println(resultSet.getString("name"));
      // System.out.println(resultSet.getDate("created_at"));
      // }
      // }

    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

}