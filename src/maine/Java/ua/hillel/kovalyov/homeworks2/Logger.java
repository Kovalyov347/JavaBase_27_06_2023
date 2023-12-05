package ua.hillel.kovalyov.homeworks2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private String filePath;

    public Logger(String filePath) {
        this.filePath = filePath;
    }

    public void createEmptyLogFile() {
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("Empty log file created: " + filePath);
            } else {
                System.out.println("Log file already exists: " + filePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeLog(String logLevel, String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(logLevel + ": " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readLogs() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("All logs:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void filterLogsByLevel(String logLevel) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nFiltered logs (" + logLevel + "):");
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(logLevel + ":")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Logger logger = new Logger("log.txt");

        //  пустой файл лога
        logger.createEmptyLogFile();

        // Записать в файл лог
        logger.writeLog("INFO", "Starting JuniorCrudServiceApplication using Java 17.0.7");
        logger.writeLog("DEBUG", "User admin created");

        // Прочитать все сообщения
        logger.readLogs();

        // Вывести только сообщения определенного уровня лога
        logger.filterLogsByLevel("INFO");
    }
}