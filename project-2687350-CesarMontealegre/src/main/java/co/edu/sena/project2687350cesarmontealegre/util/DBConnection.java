package co.edu.sena.project2687350cesarmontealegre.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL =
            "jdbc:mysql://aws.connect.psdb.cloud/my-app-form?sslMode=VERIFY_IDENTITY";
    private static final String USER =
            "jwnvrl5lzhrz5m6gdgnu";
    private  static final String PASS =
            "pscale_pw_yqp2wAoFql7vpW5XXRTtoIYqaWYocZTgBU4iAppeiSO";
    private static BasicDataSource pool;
    public static BasicDataSource getInstance() throws SQLException {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(USER);
            pool.setPassword(PASS);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }
        return pool;
    }// getConnectionToDatabase
    public static Connection getConnection() throws  SQLException {
        return  getInstance().getConnection();
    }
}
