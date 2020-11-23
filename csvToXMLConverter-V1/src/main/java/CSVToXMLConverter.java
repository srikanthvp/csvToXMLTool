public class CSVToXMLConverter {
    public static void main(String[] args) {
        Converter converter = new Converter();
        converter.convertFile("src/main/resources/Names2.csv",
                "src/main/resources/Names3.xml",
                ",");
    }
}
