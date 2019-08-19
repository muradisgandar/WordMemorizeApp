import java.sql.*;
import java.util.HashMap;

public class Database {
    public static Connection connect() throws Exception {


        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/words?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "root12345";
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;

    }

    public static HashMap<String,String> getAllDataWithKeyEng() throws Exception{
        HashMap<String,String> map = new HashMap<>();
        try(Connection conn = connect()) {
            PreparedStatement prps = conn.prepareStatement("select * from words");
            ResultSet rs = prps.executeQuery();

            while(rs.next()){
                String en = rs.getString("english");
                String az = rs.getString("azerbaijan");
                map.put(en,az);

            }


        }
        return map;

    }

    public static HashMap<String,String> getAllDataWithKeyAz() throws Exception{
        HashMap<String,String> map = new HashMap<>();
        try(Connection conn = connect()) {
            PreparedStatement prps = conn.prepareStatement("select * from words");
            ResultSet rs = prps.executeQuery();

            while(rs.next()){
                String en = rs.getString("english");
                String az = rs.getString("azerbaijan");
                map.put(az,en);

            }


        }
        return map;

    }

    public static int insert(Words words) throws Exception {
        try(Connection conn = connect()) {
            PreparedStatement prpm = conn.prepareStatement("insert words(english,azerbaijan) values(?,?)");
            prpm.setString(1,words.getEnglish());
            prpm.setString(2,words.getAzerbaijan());
            return prpm.executeUpdate();
        }


    }











}
