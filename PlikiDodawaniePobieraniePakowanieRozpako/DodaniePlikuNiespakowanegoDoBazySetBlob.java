import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DodaniePlikuNiespakowanegoDoBazySetBlob { /// pobieranie jest na podstawie PobraniePlikuNiespakowanegoZbazy.java

    public static void main(String[] args) throws SQLException, IOException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection","root","password");
        String updateSzit = "insert into tabela_plik (ID, NAME, FILE3) values (?, ?, ?);";
        PreparedStatement statement = con.prepareStatement(updateSzit);

        ///////setBlob(InputStream)
        InputStream inputStream = new FileInputStream(new File("C:\\Users\\User\\Desktop\\comment_1609947104SM2R6gk15vZdXJnLGxjSvK - Kopia.jpg"));
        statement.setBlob(3, inputStream);
        ///////setBlob(InputStream)

        ///// setBlob(byte[]) ////////////////////
//        byte[] bytesOfFile = Files.readAllBytes(new File("C:\\Users\\User\\Desktop\\comment_1609947104SM2R6gk15vZdXJnLGxjSvK - Kopia.jpg").toPath());
//        statement.setBlob(3,new ByteArrayInputStream(bytesOfFile), bytesOfFile.length);
        ///// setBlob(byte[]) ////////////////////

        statement.setInt(1, 9);
        statement.setString(2, "eghhhniss34s");
        statement.execute();
    }
}
