package LabWork03.Task04;

public class Main {

    public static void main(String[] args) {

        Tree kedr = new Tree(6, "cedar");

        Tree oak = new Tree(11, false, "oak");

        Tree tree = new Tree();

        // Вывод информации о каждом дереве
        kedr.viewInfo();
        oak.viewInfo();
        tree.viewInfo();

        kedr = null;
        oak = null;
        tree = null;
    }


}

