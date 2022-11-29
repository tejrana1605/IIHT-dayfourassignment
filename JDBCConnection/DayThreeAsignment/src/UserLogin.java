//Example of user login
import java.sql.*;
import java.util.Scanner;

public class UserLogin {
    static final  String D_URL="jdbc:mysql://localhost:3306/democog";
    static final  String USER="root";
    static final  String PASS="pass@word1";
    static final  String QUERY="select * from twit_ap_user_reg where email=? and password=?";

    public static void main(String args[]){
        System.out.println("Welcome");
        try(Connection con= DriverManager.getConnection(D_URL,USER,PASS);
            Statement stmt=con.createStatement();
            //ResultSet rs=stmt.executeQuery(QUERY);
            PreparedStatement pstmt=con.prepareStatement(QUERY);){

            Scanner s=new Scanner(System.in);

            System.out.println("Enter Email : ");
            String email=s.nextLine();
            System.out.println("Enter Password : ");
            String pwd=s.nextLine();

            pstmt.setString(1,email.trim());
            pstmt.setString(2,pwd);

            ResultSet rs=pstmt.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("fname")+" login successfully..");
            }else{
                System.out.println("Login failed..");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
