package ua.hillel.kovalyov.lessons;

public class Coords {
    public static void main(String[] args) {
        double longitude = 74.044502;
        double latitude = 40.689247;
        char specSymbol = '\u00B0';
        char specSymbol2 = '\'';
        System.out.println("Longitude: - " + longitude + " Latitude: - " + latitude);
        System.out.println("DMS Lat: 40" + specSymbol + "41" + specSymbol2 + " 21.2892'' N DMS Long: 74" + specSymbol + " 2" + specSymbol2 + " 40.2072'' W");
    }
}
