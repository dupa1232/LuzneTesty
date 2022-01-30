import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DodanieMp3doBazy { /// pobieranie jest na podstawie PobranieMp3zBazy.java
    public static void main(String[] args) throws SQLException, IOException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection","root","password");
        String updateSzit = "insert into tabela_plik (ID, NAME, FILE3, ROZSZERZENIE) values (?, ?, ?, ?);";
        PreparedStatement statement = con.prepareStatement(updateSzit);

        ///////setBlob(InputStream)
//        InputStream inputStream = new FileInputStream(new File("C:\\Users\\User\\Desktop\\Drenchill - Freed from Desire ft. Indiiana.mp3"));
//        statement.setBlob(3, inputStream);
        ///////setBlob(InputStream)

        ///// setBlob(byte[]) ////////////////////
        byte[] bytesOfFile = Files.readAllBytes(new File("C:\\Users\\User\\Desktop\\Drenchill - Freed from Desire ft. Indiiana.mp3").toPath());
        statement.setBlob(3,new ByteArrayInputStream(bytesOfFile), bytesOfFile.length);
        ///// setBlob(byte[]) ////////////////////

        statement.setInt(1, 11);
        statement.setString(2, "piosenka");
        statement.setString(4, "mp3");
        statement.execute();
    }
}
