import java.sql.*;
import java.util.Scanner;

public class Update {
    static final  String D_URL="jdbc:mysql://localhost:3306/democog";
    static final  String USER="root";
    static final  String PASS="pass@word1";
    static final  String QUERY="update employee set emp_name=?,emp_add=? where emp_id=?;";
    static final String QURY="select * from employee";

    public static void main(String args[]){
        System.out.println("Welcome");
        try(Connection con= DriverManager.getConnection(D_URL,USER,PASS);
            Statement stmt=con.createStatement();
            PreparedStatement pstmt=con.prepareStatement(QUERY);){

            Scanner s=new Scanner(System.in);
            System.out.println("Enter Emp Name : ");
            String name=s.nextLine();
            System.out.println("Enter Emp Address : ");
            String add=s.nextLine();
            System.out.println("Enter Emp Id : ");
            int id=s.nextInt();

            System.out.println("Before Update : \n");
            ResultSet rs = stmt.executeQuery("select emp_id,emp_name,emp_add from employee where emp_id='" + id + "'");
            while (rs.next()) {
                System.out.println("Employee Id : " + rs.getInt("emp_id"));
                System.out.println("Employee Name : " + rs.getString("emp_name"));
                System.out.println("Employee Address : " + rs.getString("emp_add"));
            }

            pstmt.setString(1,name);
            pstmt.setString(2,add);
            pstmt.setInt(3,id);

            boolean status=pstmt.execute();
            System.out.println("After Update : \n");
            if(!status) {
                rs = stmt.executeQuery("select emp_id,emp_name,emp_add from employee where emp_id='" + id + "'");
                while (rs.next()) {
                    System.out.println("Employee Id : " + rs.getInt("emp_id"));
                    System.out.println("Employee Name : " + rs.getString("emp_name"));
                    System.out.println("Employee Address : " + rs.getString("emp_add"));
                }
                rs.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}