import java.io.*;
import java.sql.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipWoparciuOBaeldunga { //dodawanie powstało w oparciu o Baeldunga jest w SpakowanieIdodaniePlikuDoBazy.java


    public static void main(String[] args) throws SQLException, IOException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection","root","password");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select FILE3 from tabela_plik where ID = 12");

        resultSet.next();
        String pathToSzit = "C:\\Users\\User\\Desktop\\zippedSzit23a.zip";
        InputStream initialStream = resultSet.getBinaryStream("FILE3");
        OutputStream outStream = new FileOutputStream(pathToSzit);

        byte[] buffer = new byte[8 * 1024];
        int bytesRead;
        while ((bytesRead = initialStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
        initialStream.close();
        outStream.close();

        //rozpakowanie
        //https://www.baeldung.com/java-compress-and-uncompress
        // nie udało się, bo było, że proces nie może uzyskać dostępu do destDir, bo jest używane przez inny proces. Ale, pobieranie za pomocą PobranieZipaZbayIrozpakowanie.java działa
        buffer = new byte[1024];
        ZipInputStream zis = new ZipInputStream(new FileInputStream(pathToSzit));
        ZipEntry zipEntry = zis.getNextEntry();
        File destDir = new File("C:\\Users\\User\\Desktop" +zipEntry.getName());

        while (zipEntry != null) {
            FileOutputStream fos = new FileOutputStream(destDir);
            int len;
            while ((len = zis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
            fos.close();
        }
        zis.closeEntry();
        zis.close();

    }
}
