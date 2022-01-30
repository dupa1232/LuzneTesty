import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

//na podstawie https://zetcode.com/java/zipinputstream/ gdzie zippedSzit23.zip jest pobrany w PobraniePlikuZbazy.java plikiem z bazy :)
public class RozpakowaniePliku {
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        byte[] buffer = new byte[2048];
        Path outDir = Paths.get("C:\\Users\\User\\Desktop");
        try (FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\zippedSzit23.zip"); //tu jest tworzony obiekt "fis" na podstawie zipa, czyli podajemy do niego sciezke
        BufferedInputStream bis = new BufferedInputStream(fis);

        ZipInputStream stream = new ZipInputStream(bis)){

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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
