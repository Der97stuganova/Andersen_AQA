package hw7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CsvFile extends AppData {
    public static void main(String[] args) {

        String[] header;
        int[] data;

        AppData appData = new AppData();
        appData.setHeader(new String[]{"Value1", "Value2", "Value3"});
        appData.setData(new int[]{123, 100, 300});
        header = appData.getHeader();
        data = appData.getData();

        csvWrite(header, data);
    }

    public static void csvWrite(String[] header, int[] data) {
        try (PrintWriter writer = new PrintWriter("test.csv")) {

            String sb = header[0] +
                    "," +
                    header[1] +
                    "," +
                    header[2] +
                    "\n" +
                    data[0] +
                    ',' +
                    data[1] +
                    ',' +
                    data[2] +
                    '\n';

            writer.write(sb);

            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
