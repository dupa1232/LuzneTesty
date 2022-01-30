import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class SpakowanieIdodaniePlikuDoBazy {

    public static void main(String[] args) throws IOException, SQLException {

        //https://www.baeldung.com/java-compress-and-uncompress
        FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Desktop\\zippedSzit2.zip");

        File fileToZip = new File("C:\\Users\\User\\Desktop\\comment_1609947104SM2R6gk15vZdXJnLGxjSvK - Kopia.jpg");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        FileInputStream fis = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
        zipOut.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while((length = fis.read(bytes)) >= 0) {
            zipOut.write(bytes, 0, length);
        }
        //// konieczne jest pozakmykanie, bo bez tego, tworzyło zipa, ale pplik w środku miał 0 (zero) bajtów!!!!
        zipOut.close();
        fis.close();
        fos.close();


        // zapis do bazyy!!!!!!
        File asd = new File("C:\\Users\\User\\Desktop\\zippedSzit2.zip");
        InputStream inputStream = new DataInputStream(new FileInputStream(asd));

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection","root","password");
        String updateSzit = "insert into tabela_plik(ID, FILE3, ROZSZERZENIE) values (?,?,?)";

        PreparedStatement statement = con.prepareStatement(updateSzit);
        statement.setInt(1, 12);
        statement.setBinaryStream(2,inputStream);
        statement.setString(3, "zip");
        statement.execute();

    }
}
