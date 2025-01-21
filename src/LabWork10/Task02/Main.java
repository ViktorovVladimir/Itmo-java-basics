package LabWork10.Task02;

import java.io.File;
import java.io.IOException;
import java.io.*;

public class Main {


    public static void writeStringToMyTxtFile(String path, String text) throws IOException {

        File file = new File(path);

        /*
        try {
            os = new FileOutputStream(file);
            os.write(text.getBytes());
        } finally {
            if (os != null) {
                os.close();
            }
        }
        */

        try (OutputStream os = new FileOutputStream(file)) {
            os.write(text.getBytes());
        }
    }

    public static void main(String[] args) {

        String filePath = "files/write_file.txt";
        String sWriteStr = "This is line for save in my txt file2";

        try {

            writeStringToMyTxtFile(filePath, sWriteStr);
            System.out.println("The string was successfully written to the file.");

        } catch (IOException e) {
            System.err.println("Attention write error!!!: " + e.getMessage());
        }
    }

}
