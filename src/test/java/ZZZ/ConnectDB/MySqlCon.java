package ZZZ.ConnectDB;

import org.openqa.selenium.interactions.Actions;

import java.sql.*;

public class MySqlCon {

    public static void main(String args[]){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            //here sonoo is database name, root is username and password
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
