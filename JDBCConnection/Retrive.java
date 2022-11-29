import java.sql.*;

public class Retrive {
    static final  String D_URL="jdbc:mysql://localhost:3306/democog";
    static final  String USER="root";
    static final  String PASS="pass@word1";
    static final  String QUERY="select * from employee";

    public static void main(String args[]){
        System.out.println("Welcome");
        try(Connection con= DriverManager.getConnection(D_URL,USER,PASS);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(QUERY);){

            while(rs.next()){
                System.out.println("Employee Id : "+rs.getInt("emp_id"));
                System.out.println("Employee Name : "+rs.getString("emp_name"));
                System.out.println("Employee Address : "+rs.getString("emp_add"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
