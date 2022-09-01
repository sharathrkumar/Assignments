import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/list", "root", "Sharu@888");
            Statement state = connect.createStatement();
            ResultSet rs = state.executeQuery("select * from student");
            System.out.println("USN Name");
            while (rs.next())
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            connect.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}