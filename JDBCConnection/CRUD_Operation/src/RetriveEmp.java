import java.sql.*;
import java.util.Scanner;

public class RetriveEmp {
    static final  String D_URL="jdbc:mysql://localhost:3306/democog";
    static final  String USER="root";
    static final  String PASS="pass@word1";
    static final  String QUERY="select * from employee where emp_id='";

    public static void main(String args[]){
        System.out.println("Welcome");
        try(Connection con= DriverManager.getConnection(D_URL,USER,PASS);
            Statement stmt=con.createStatement();
            ){

            Scanner s=new Scanner(System.in);
            System.out.println("Enter Emp Id : ");
            int id=s.nextInt();

            ResultSet rs=stmt.executeQuery(QUERY+id+"'");
            if(rs.next()){
                System.out.println("Employee Id : "+rs.getInt("emp_id"));
                System.out.println("Employee Name : "+rs.getString("emp_name"));
                System.out.println("Employee Address : "+rs.getString("emp_add"));
            }else{
                System.out.println("Employee details with id " + id + " not present..");
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
