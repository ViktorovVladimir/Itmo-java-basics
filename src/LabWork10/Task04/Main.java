package LabWork10.Task04;

import java.io.*;


public class Main {

    public static void replace(String inPath, String outPath) throws IOException {
        File inputFile = new File(inPath);
        File outputFile = new File(outPath);

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {

            String sLine;
            while ((sLine = reader.readLine()) != null) {
                String sModifLine = sLine.replaceAll("[^a-zA-Z0-9]", "\\$");
                writer.write(sModifLine);
                writer.write(System.lineSeparator());
            }
        }
    }


    public static void main(String[] args) {

        String filePath = "files/file.txt";
        String filePathSave = "files/write_file.txt";

        try {

            replace(filePath, filePathSave);
            System.out.println("Replace was successfully and written to the other file.");

        } catch (IOException e) {
            System.err.println("Attention write error!!!: " + e.getMessage());
        }
    }

}
