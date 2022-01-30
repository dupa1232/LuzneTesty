import java.sql.*;

class MysqlCon{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String updateSzit = "update tabela_plik set FILE = ? where ID = 1";

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection","root","password");
            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery("select * from tabela_plik");

            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
// bangla, chociaż zwraca warning, że aktualny driver jest deprecated
            con.close();

        }catch(Exception e){ System.out.println(e);}



    }
}
