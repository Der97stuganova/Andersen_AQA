package hw7;

import com.opencsv.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RWCSFile {
    public static final String CSVFile = "CSVFile.csv";

    public static void saveDataToFile(AppData data) {
        File file = new File(CSVFile);

        try {
            FileWriter outputfile = new FileWriter(file);

            CSVWriter writer = new CSVWriter(outputfile, ';',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);

            List<String[]> allData = new ArrayList<>();

            data.setHeader(new String[]{"Value1", "Value2", "Value3"});

            allData.add(data.getHeader());

            data.setData(new int[][]{{2, 12, 1993}, {27, 4, 1997}, {19, 3, 2002}});

            for (int i = 0; i < data.getData().length; i++) {
                String[] numsAsString = new String[data.getData()[i].length];
                for (int j = 0; j < data.getData()[i].length; j++) {
                    numsAsString[j] = String.valueOf(data.getData()[i][j]);
                }
                allData.add(numsAsString);
            }

            writer.writeAll(allData);

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readDataFromFile(String file) {
        try {
            FileReader filereader = new FileReader(file);

            CSVParser parser = new CSVParserBuilder()
                    .withSeparator(';')
                    .build();

            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withCSVParser(parser)
                    .build();

            List<String[]> allData = csvReader.readAll();

            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

