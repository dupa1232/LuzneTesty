import java.io.*;
import java.sql.*;

public class PobraniePlikuNiespakowanegoZbazy { //// DZIALA, ZROBIONE RACZEZJ WSZYSTKIE PRZYPADKI!!!!!!!!!!!!!!!!

    public static void main(String[] args) throws SQLException, IOException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection", "root", "password");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select FILE3 from tabela_plik where ID = 5");
        resultSet.next();
        String pathToSzit = "C:\\Users\\User\\Desktop\\dupaaa.jpg";

        //pobranie pliku dodanego w klasie DodaniePlikuNiespakowanegoDoBazySetBlob.java
        // na podstawie fragmentu ->>>>>> ///////setBlob(InputStream)

        /// a) można do bloba pobierać
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
        /// a) można do bloba pobierać
        /// b) ale można też od razu do binarki
//        InputStream initialStream = resultSet.getBinaryStream("FILE3");
//
//        OutputStream outStream = new FileOutputStream(pathToSzit);
//
//        byte[] buffer = new byte[8 * 1024];
//        int bytesRead;
//        while ((bytesRead = initialStream.read(buffer)) != -1) {
//            outStream.write(buffer, 0, bytesRead);
//        }
        /// b) ale można też od razu do binarki
        //pobranie pliku dodanego w klasie DodaniePlikuNiespakowanegoDoBazySetBlob.java
        // na podstawie fragmentu ->>>>>> ///////setBlob(InputStream)


        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        //pobranie pliku dodanego w klasie DodaniePlikuNiespakowanegoDoBazySetBlob.java
        // na podstawie fragmentu ->>>>>> ///////setBlob(byte[])
        /// a) można do bloba pobierać
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
        /// a) można do bloba pobierać
        /// b) ale można też od razu do binarki
//        InputStream initialStream = resultSet.getBinaryStream("FILE3");
//
//        OutputStream outStream = new FileOutputStream(pathToSzit);
//
//        byte[] buffer = new byte[8 * 1024];
//        int bytesRead;
//        while ((bytesRead = initialStream.read(buffer)) != -1) {
//            outStream.write(buffer, 0, bytesRead);
//        }
        /// b) ale można też od razu do binarki

        // yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy

        //pobranie pliku dodanego w klasie DodaniePlikuDoBazy.java w sposób setBinaryStream()
        /// a) można do bloba pobierać
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
        /// a) można do bloba pobierać
        /// b) ale można też od razu do binarki
        InputStream initialStream = resultSet.getBinaryStream("FILE3");

        OutputStream outStream = new FileOutputStream(pathToSzit);

        byte[] buffer = new byte[8 * 1024];
        int bytesRead;
        while ((bytesRead = initialStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
        /// b) ale można też od razu do binarki
        //pobranie pliku dodanego w klasie DodaniePlikuDoBazy.java w sposób setBinaryStream()


        initialStream.close();
        outStream.close();
    }
}
