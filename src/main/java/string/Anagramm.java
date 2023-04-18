package main.java.string;

import java.util.Arrays;

public class Anagramm {
    /**
     * написать метод который определяет является ли слово анаграммой (обезьянство, место, мечеть)
     */
    static String string1 = "обезьянство";
    static String string2 = "место";
    static String string3 = "мечеть";

    public void anagrama() {
        char[] chs1 = string1.toCharArray();
        char[] chs2 = string2.toCharArray();
        char[] chs3 = string3.toCharArray();
        Arrays.sort(chs1);
        Arrays.sort(chs2);
        Arrays.sort(chs3);
        string1 = new String(chs1);
        string2 = new String(chs2);
        string3 = new String(chs3);

        if (string1.equals(string2)) {
            System.out.println("'Обезьянство' и 'место' являются анаграммами");
        } else if (string1.equals(string3)) {
            System.out.println("'Обезьянство' и 'мечеть' являются анаграммами");
        } else if (string2.equals(string3)) {
            System.out.println("'Mесто' и 'мечеть' являются анаграммами");
        } else {
            System.out.println("Слова не являются анаграммами");
        }
    }
}
