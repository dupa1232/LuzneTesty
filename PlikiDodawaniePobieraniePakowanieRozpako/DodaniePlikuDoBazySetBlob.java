import java.io.*;
import java.sql.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class DodaniePlikuDoBazySetBlob {

    public static void main(String[] args) throws IOException, SQLException {

        //https://www.baeldung.com/java-compress-and-uncompress
        String pathToZipSzit = "C:\\Users\\User\\Desktop\\zippedSzitAndSendAsBlob.zip";
        FileOutputStream fos = new FileOutputStream(pathToZipSzit);

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

        //Polaczenie do bay mysql i dodanie BLOBa - w oparciu o https://stackoverflow.com/questions/9430008/inserting-blob-data-in-java-using-preparedstatement
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection","root","password");
        String updateSzit = "insert into tabela_plik (ID, NAME, FILE3) values (4,'dupaxaa', ?);";
        PreparedStatement statement = connection.prepareStatement(updateSzit);

        //Przygotowanie pliku do wyslania
        File fileToInsert = new File(pathToZipSzit);
        /*
        FileInputStream fileInputStream = new FileInputStream(fileToInsert);
        statement.setBlob(1, fileInputStream);
        */
        //powysze / ponizsze (miedzy /* */) mozna zamiennie, bo FileInputStream extends InputStream!!!!

        InputStream inputStream = new FileInputStream(fileToInsert);
        statement.setBlob(1,inputStream);

        statement.execute();

        statement.close();
        connection.close();
    }
}
