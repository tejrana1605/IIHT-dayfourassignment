import java.sql.*;
import java.util.Scanner;

public class Insert {
    static final  String D_URL="jdbc:mysql://localhost:3306/democog";
    static final  String USER="root";
    static final  String PASS="pass@word1";
    static final  String QUERY="insert into employee(emp_id,emp_name,emp_add) values(?,?,?);";
    static final String QURY="select * from employee";

    public static void main(String args[]){
        System.out.println("Welcome");
        try(Connection con= DriverManager.getConnection(D_URL,USER,PASS);
            Statement stmt=con.createStatement();
            PreparedStatement pstmt=con.prepareStatement(QUERY);

            ){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter Emp Name : ");
            String name=s.nextLine();
            System.out.println("Enter Emp Address : ");
            String add=s.nextLine();
            System.out.println("Enter Emp Id : ");
            int id=s.nextInt();
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            pstmt.setString(3,add);
            boolean status=pstmt.execute();
            if(!status) {
                ResultSet rs = stmt.executeQuery("select emp_id,emp_name,emp_add from employee where emp_id='" + id + "'");
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