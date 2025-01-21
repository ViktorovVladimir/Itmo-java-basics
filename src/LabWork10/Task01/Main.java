package LabWork10.Task01;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> readMyTxtFileToList(String filePath) throws IOException {

        ///return Files.readAllLines(Paths.get(filePath));

        File file = new File(filePath);
        try( BufferedReader reader = new BufferedReader( new FileReader(file))) {
            List<String> result = new ArrayList<>();
            String line ;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
            return result;
        }
    }

    public static void main(String[] args) {

        try {
            List<String> lines = readMyTxtFileToList("files/file.txt");

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Attention read error!!!: " + e.getMessage());
        }
    }

}
