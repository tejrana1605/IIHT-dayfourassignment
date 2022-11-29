import java.sql.*;
import java.util.Scanner;

public class Delete {
    static final  String D_URL="jdbc:mysql://localhost:3306/democog";
    static final  String USER="root";
    static final  String PASS="pass@word1";
    static final  String QUERY="delete from employee where emp_id=?;";

    public static void main(String args[]){
        System.out.println("Welcome");
        try(Connection con= DriverManager.getConnection(D_URL,USER,PASS);
            Statement stmt=con.createStatement();
            PreparedStatement pstmt=con.prepareStatement(QUERY);){

            Scanner s=new Scanner(System.in);
            System.out.println("Enter Emp Id : ");
            int id=s.nextInt();

            ResultSet rs = stmt.executeQuery("select emp_id,emp_name,emp_add from employee where emp_id='" + id + "'");

            if(rs.next()) {
                System.out.println("Before Delete : \n");
                System.out.println("Employee Id : " + rs.getInt("emp_id"));
                System.out.println("Employee Name : " + rs.getString("emp_name"));
                System.out.println("Employee Address : " + rs.getString("emp_add"));

                pstmt.setInt(1, id);
                boolean status = pstmt.execute();
                rs.close();
                if (!status) {
                    System.out.println("Employee with id " + id + " deleted successfully.");

                } else {
                    System.out.println("Employee with id " + id + " not deleted. Some thing is wrong..");
                }
            } else{
                System.out.println("Employee with id " + id + " not present..");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}