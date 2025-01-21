package LabWork10.Task03;

import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void writeFromLists(String path, List<String> txt1, List<String> txt2) throws IOException {

        File file = new File(path);

        try (OutputStream os = new FileOutputStream(file)) {
            for (String line : txt1) {
                os.write(line.getBytes());
                os.write(System.lineSeparator().getBytes());
            }
            for (String line : txt2) {
                os.write(line.getBytes());
                os.write(System.lineSeparator().getBytes());
            }
        }
    }

    public static List<String> readToList(String filePath) throws IOException {

        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<String> result = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
            return result;
        }
    }


    public static void main(String[] args) {

        String filePath1 = "files/file1.txt";
        String filePath2 = "files/file2.txt";
        String filePathSave = "files/write_file.txt";

        try {

            List<String> lines1 = readToList( filePath1 );
            List<String> lines2 = readToList( filePath2 );
            writeFromLists( filePathSave, lines1, lines2 );

            System.out.println("The file1 and file2 was successfully written to the other file.");

        } catch (IOException e) {
            System.err.println("Attention write error!!!: " + e.getMessage());
        }
    }

}
