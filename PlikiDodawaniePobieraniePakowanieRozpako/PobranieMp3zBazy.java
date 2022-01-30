import java.io.*;
import java.sql.*;

public class PobranieMp3zBazy {
    public static void main(String[] args) throws SQLException, IOException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection", "root", "password");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select FILE3 from tabela_plik where ID = 11");
        resultSet.next();
        String pathToSzit = "C:\\Users\\User\\Desktop\\szitMuzyczny9.mp3";

        //pobranie pliku dodanego w klasie DodanieMp3doBazy.java
        // na podstawie fragmentu ->>>>>> ///////setBlob(InputStream)

        /// a) mo¿na do bloba pobieraæ
//        Blob blob = resultSet.getBlob("FILE3");
//        InputStream initialStream = blob.getBinaryStream();
//
//        OutputStream outStream = new FileOutputStream(pathToSzit);
//
//        byte[] buffer = new byte[8 * 1024];
//        int bytesRead;
//        while ((bytesRead = initialStream.read(buffer)) != -1) {
//            outStream.write(buffer, 0, bytesRead);
//        }
        /// a) mo¿na do bloba pobieraæ
        /// b) ale mo¿na te¿ od razu do binarki
//        InputStream initialStream = resultSet.getBinaryStream("FILE3");
//
//        OutputStream outStream = new FileOutputStream(pathToSzit);
//
//        byte[] buffer = new byte[8 * 1024];
//        int bytesRead;
//        while ((bytesRead = initialStream.read(buffer)) != -1) {
//            outStream.write(buffer, 0, bytesRead);
//        }
        /// b) ale mo¿na te¿ od razu do binarki
        //pobranie pliku dodanego w klasie DodaniePlikuNiespakowanegoDoBazySetBlob.java
        // na podstawie fragmentu ->>>>>> ///////setBlob(InputStream)


        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        //pobranie pliku dodanego w klasie DodaniePlikuNiespakowanegoDoBazySetBlob.java
        // na podstawie fragmentu ->>>>>> ///////setBlob(byte[])
        /// a) mo¿na do bloba pobieraæ
//        Blob blob = resultSet.getBlob("FILE3");
//        InputStream initialStream = blob.getBinaryStream();
//
//        OutputStream outStream = new FileOutputStream(pathToSzit);
//
//        byte[] buffer = new byte[8 * 1024];
//        int bytesRead;
//        while ((bytesRead = initialStream.read(buffer)) != -1) {
//            outStream.write(buffer, 0, bytesRead);
//        }
        /// a) mo¿na do bloba pobieraæ
        /// b) ale mo¿na te¿ od razu do binarki
//        InputStream initialStream = resultSet.getBinaryStream("FILE3");
//
//        OutputStream outStream = new FileOutputStream(pathToSzit);
//
//        byte[] buffer = new byte[8 * 1024];
//        int bytesRead;
//        while ((bytesRead = initialStream.read(buffer)) != -1) {
//            outStream.write(buffer, 0, bytesRead);
//        }
        /// b) ale mo¿na te¿ od razu do binarki

        // yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy

        //pobranie pliku dodanego w klasie DodaniePlikuDoBazy.java w sposób setBinaryStream()
        /// a) mo¿na do bloba pobieraæ
//        Blob blob = resultSet.getBlob("FILE3");
//        InputStream initialStream = blob.getBinaryStream();
//
//        OutputStream outStream = new FileOutputStream(pathToSzit);
//
//        byte[] buffer = new byte[8 * 1024];
//        int bytesRead;
//        while ((bytesRead = initialStream.read(buffer)) != -1) {
//            outStream.write(buffer, 0, bytesRead);
//        }
        /// a) mo¿na do bloba pobieraæ
        /// b) ale mo¿na te¿ od razu do binarki
        InputStream initialStream = resultSet.getBinaryStream("FILE3");

        OutputStream outStream = new FileOutputStream(pathToSzit);

        byte[] buffer = new byte[8 * 1024];
        int bytesRead;
        while ((bytesRead = initialStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
        /// b) ale mo¿na te¿ od razu do binarki
        //pobranie pliku dodanego w klasie DodaniePlikuDoBazy.java w sposób setBinaryStream()


        initialStream.close();
        outStream.close();
    }
}
