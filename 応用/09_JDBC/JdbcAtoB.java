import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcAtoB {

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
    Connection connection = null;
    try {
      connection = DriverManager.getConnection(URL);
      // 1. 自動コミットさせない設定
      connection.setAutoCommit(false);

      // ↓ユーザーAさんのお金を1,000円減らすSQLを発行
      PreparedStatement statementA = connection.prepareStatement("update user set money = money - 1000 where id = 4");
      statementA.execute();
      statementA.close();

      // ↓ユーザーBさんのお金を1,000円増やすSQLを発行
      PreparedStatement statementB = connection.prepareStatement("update user set money = money + 1000 where id = 5");
      statementB.execute();
      statementB.close();

      // 2. 全てのSQLが成功したので、コミット処理
      connection.commit();

    } catch (SQLException e) {
      // 3. 例外が発生したのでロールバック処理
      try {
        connection.rollback();
      } catch (SQLException e2) {
        e2.printStackTrace();
      }
    } finally {
      if (connection != null) {
        try {
          // オートコミット有効化
          connection.setAutoCommit(true);
          connection.close();
        } catch (SQLException e3) {
          e3.printStackTrace();
        }
      }
    }

  }

}