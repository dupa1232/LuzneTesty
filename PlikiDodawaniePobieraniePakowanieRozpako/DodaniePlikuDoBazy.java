import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DodaniePlikuDoBazy { /// zrobione, diała//////////////////////////////////

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection","root","password");
            String updateSzit = "update tabela_plik set FILE3 = ? where ID = 5";

            File someFile = new File("C:\\Users\\User\\Desktop\\comment_1609947104SM2R6gk15vZdXJnLGxjSvK - Kopia.jpg");
            InputStream targetStream = new FileInputStream(someFile);

            PreparedStatement statement = con.prepareStatement(updateSzit);
            statement.setBinaryStream(1,targetStream);
            statement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        catch (FileNotFoundException s) {
            s.printStackTrace();
        }
    }
}
