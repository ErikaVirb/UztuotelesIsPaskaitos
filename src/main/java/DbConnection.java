import java.sql.*;
public class DbConnection {

    public  static void main(String[]args){

            String url = "jdbc:postgresql://localhost/seleniumData";
            String user = "postgres";
            String password = "Amerika12";

            // creates data base tables
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            String hotelsTable = "CREATE TABLE hotels " +
                    "(id SERIAL PRIMARY KEY, " +
                    "hotel_title VARCHAR(250), " +
                    "price INT, " +
                    "address VARCHAR(250)) ";
            stmt.executeUpdate(hotelsTable);
            System.out.println("Table created successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
//        return null;
    }

         // connection to data base
     public static PreparedStatement databaseConn(String sql){
         String url = "jdbc:postgresql://localhost/seleniumData";
         String user = "postgres";
         String password = "Amerika12";

         try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;

        }

}
}