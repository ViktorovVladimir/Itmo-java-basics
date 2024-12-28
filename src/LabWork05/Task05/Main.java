package LabWork05.Task05;

public class Main {

    private static String reversWords(String text) {

        String sResult = "";

        String[] strings = text.replaceAll("[^а-яА-ЯёЁa-zA-Z\\s]", "").split("\\s+");

        StringBuilder builder = new StringBuilder();

        for (String s : strings) {
            //builder.insert(0, s);
            builder.append(s);
            sResult += builder.reverse() + " ";
            builder.setLength(0);
        }

        builder = null;
        return sResult;
    }

    public static void main(String[] args) {

        String sTest = "This is a test string";

        System.out.println("The given string is: " + sTest);
        System.out.println("The string reversed word by word is: " + reversWords(sTest));

    }


}
