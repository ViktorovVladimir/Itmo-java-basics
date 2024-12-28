package LabWork05.Task04;

public class Main {

    private static int wordCount(String text, String word) {

        int iIndex = 0;
        int iCount = 0;

        while ((iIndex = text.indexOf(word, iIndex)) != -1) {
            iCount++;
            iIndex += word.length();
        }

        return iCount;
    }

    public static void main(String[] args) {

        String text = "Тысячи волонтеров бяка вручную Бяка собирают мазут бяка бяка бяка на пляжах, отмывают от него собак бяка, дельфинов Бяка бяка и птиц БЯКА! и просят власти дать технику хотя бы для вывоза мусора бяка бяка. Нефтепродукты тают бяка в мешках бяка бяка и обратно вытекают бякабякабякана песок.";
        String word = "бяка";

        System.out.println(wordCount(text, word));
    }
}
