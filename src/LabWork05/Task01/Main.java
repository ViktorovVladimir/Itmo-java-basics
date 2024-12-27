package LabWork05.Task01;

public class Main {

    private static String getLongestStr(String text) {

        String lStr = "";
        int iMaxLen = 0;

        String sReplace = text.replaceAll("[^а-яА-ЯёЁa-zA-Z\\s]", "");
        String[] strings = sReplace.split("\\s+");

        for (String s : strings) {
            if (s.length() > iMaxLen) {
                iMaxLen = s.length();
                lStr = s;
            }
        }

        return lStr;
    }

    public static void main(String[] args) {

        String text = "\n" +
                "Что такое Lorem Ipsum?\n" +
                "Lorem Ipsum - это текст-\"рыба\", часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной \"рыбой\" для текстов на латинице с начала XVI века. В то время некий безымянный печатник создал большую коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки образцов. Lorem Ipsum не только успешно пережил без заметных изменений пять веков, но и перешагнул в электронный дизайн. Его популяризации в новое время послужили публикация листов Letraset с образцами Lorem Ipsum в 60-х годах и, в более недавнее время, программы электронной вёрстки типа Aldus PageMaker, в шаблонах которых используется Lorem Ipsum.\n";


        String sLongStr = getLongestStr(text);

        System.out.println("the longest word is \"" + sLongStr + "\",  number of letters: " + sLongStr.length());
    }

}
