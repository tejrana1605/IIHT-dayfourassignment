//Example of User Registration
import java.sql.*;
import java.util.Scanner;

public class UserRegistration {
    static final  String D_URL="jdbc:mysql://localhost:3306/democog";
    static final  String USER="root";
    static final  String PASS="pass@word1";
    static final  String QUERY="insert into twit_ap_user_reg(fname,email,password) values(?,?,?);";

    public static void main(String args[]){
        try(Connection con= DriverManager.getConnection(D_URL,USER,PASS);
            Statement stmt=con.createStatement();
            PreparedStatement pstmt=con.prepareStatement(QUERY);

        ){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter First Name : ");
            String fname=s.nextLine();
            System.out.println("Enter Email : ");
            String email=s.nextLine();
            System.out.println("Enter Password : ");
            String pwd=s.nextLine();


                ResultSet rs = stmt.executeQuery("select fname,email,password from twit_ap_user_reg where email='" + email.trim() + "'");
                if (rs.next()) {
                    System.out.println("User " + rs.getString("fname")+" is already registered with the email "
                            +rs.getString("email"));

                }else{
                    pstmt.setString(1,fname);
                    pstmt.setString(2,email.trim());
                    pstmt.setString(3,pwd);
                    int count=pstmt.executeUpdate();
                    if(count>0){
                        System.out.println("Thank you for registration successfully..");
                    }
                    rs.close();
                }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
