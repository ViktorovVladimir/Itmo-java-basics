package LabWork05.Task03;

public class Main {

    private static String biakaReplace(String text) {

        return text.replaceAll("(?i)бяка", "[вырезано цензурой]");
    }

    public static void main(String[] args) {

        String text = "Тысячи волонтеров бяка вручную Бяка собирают мазут бяка бяка бяка на пляжах, отмывают от него собак бяка, дельфинов Бяка бяка и птиц БЯКА! и просят власти дать технику хотя бы для вывоза мусора бяка бяка. Нефтепродукты тают бяка в мешках бяка бяка и обратно вытекают бякабякабякана песок.";

        System.out.println(biakaReplace(text));
    }

}
