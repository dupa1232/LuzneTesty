import java.io.*;
import java.sql.*;

public class PobraniePlikuZbazy {

    //oprócz tego, przerobienie na string (tak jak w sygnity) czyli to, co było rzutowane na Blob a potem .toBinary......
    // SPRAWDZIĆ, CZY KAŻDY RODZAJ PLIKU DA SIĘ TAK BEZPAKOWANIA ZAPISAĆ DO BAZY, A POTEM POBRAĆ I ZAPISAĆ NA DYSKU
    // OBCZAIĆ DZIAŁANIE TEJ PĘTLI, KTÓRA JEST UŻYWANA PODCZAS OBSŁUGI BYTE-ÓW, GDY POBIERZEMY PLIK Z BAZY, ORAZ PO CO PODAJE SIĘ, TAK JAK NP. W TEJ KLASIE, ROZMIAR TABLICY ->>> byte[] buffer = new byte[8 * 1024];

    public static void main(String[] args) throws SQLException, IOException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection","root","password");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select FILE3 from tabela_plik where ID = 2");

        resultSet.next();
        InputStream initialStream = resultSet.getBinaryStream("FILE3");
        File targetFile = new File("C:\\Users\\User\\Desktop\\zippedSzit23.tmp"); // to się wydaje niepotrzebne
        OutputStream outStream = new FileOutputStream("C:\\Users\\User\\Desktop\\zippedSzit23.zip");

        byte[] buffer = new byte[8 * 1024];
        int bytesRead;
        while ((bytesRead = initialStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
        initialStream.close();
        outStream.close();
    }

    //https://www.baeldung.com/convert-input-stream-to-a-file - korzystałem z tego, punkt 2
    //https://stackoverflow.com/questions/2120255/resultset-exception-before-start-of-result-set - oraz z tego, gdy leciał błąd "before start of result set" - trzeba było użyć .next() na resultSet
}
