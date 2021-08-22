package hw7;

public class Thetest {
    public static void main(String[] args) {
        AppData appData = new AppData();
        RWCSFile.saveDataToFile(appData);
        RWCSFile.readDataFromFile(RWCSFile.CSVFile);
    }
}
