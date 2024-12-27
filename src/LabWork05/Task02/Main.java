package LabWork05.Task02;

public class Main {

    private static boolean palindromChecker(String word) {

        for (int i = 0; i < (word.length() + 1) >> 1; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "дед";

        System.out.println(word + " - is this a palindrome? Answer: " + palindromChecker(word));
    }

}
