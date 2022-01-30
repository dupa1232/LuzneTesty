import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class PobranieZipaZbayIrozpakowanie {
    public static void main(String[] args) throws SQLException, IOException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection","root","password");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select FILE3 from tabela_plik where ID = 5");

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
        //na podstawie https://zetcode.com/java/zipinputstream/
        buffer = new byte[2048];
        Path outDir = Paths.get("C:\\Users\\User\\Desktop");
        FileInputStream fis = new FileInputStream(pathToSzit); //tu jest tworzony obiekt "fis" na podstawie juz pobranego wczesniej zipa, który jest w tym samym miejscu co "pathToSzit"
        BufferedInputStream bis = new BufferedInputStream(fis);

        ZipInputStream stream = new ZipInputStream(bis);

        ZipEntry entry;
        while ((entry = stream.getNextEntry()) != null) {

                Path filePath = outDir.resolve(entry.getName());

                try (FileOutputStream fos = new FileOutputStream(filePath.toFile());
                     BufferedOutputStream bos = new BufferedOutputStream(fos, buffer.length)) {

                    int len;
                    while ((len = stream.read(buffer)) > 0) {
                        bos.write(buffer, 0, len);
                    }
                }
            }

    }
}
