package main.java.string;

import java.util.Arrays;

public class Anagramm {
    /**
     * написать метод который определяет является ли слово анаграммой
     */

    public static void anagrama(String string1, String string2) {
        System.out.println("Являются  ли пара "+  string1+"  и "+string2 +" анаграммой ?");
        char[] chs1 = string1.toCharArray();
        char[] chs2 = string2.toCharArray();
        Arrays.sort(chs1);
        Arrays.sort(chs2);
        string1 = new String(chs1);
        string2 = new String(chs2);
        if (string1.equals(string2)) {
            System.out.println("ДА");
        } else  {
            System.out.println("НЕТ");
        }
    }
}
