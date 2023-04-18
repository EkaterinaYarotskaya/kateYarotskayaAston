package main.java.string;

import java.util.HashMap;
import java.util.Scanner;

public class StringPage {
    /**
     * Перевернуть строку «Никогда не ошибается тот, кто ничего не делает», изменив расположение символов в строке задом наперёд без использования встроенной в String функции reverse().
     */
    public void stringTurnOver() {
        String string = "Никогда не ошибается тот, кто ничего не делает", emptyString = "";
        char c;
        for (int i = 0; i < string.length(); i++) {
            c = string.charAt(i);
            emptyString = c + emptyString;
        }
        System.out.println("Перевернутая строка: " + emptyString);
    }

    /**
     * Подсчитать количество конкретных слов в строке "Упади семь раз и восемь раз поднимись", используя HashMap.
     */
    public void hashMap() {
        String text = "Упади семь раз и восемь раз поднимись";
        String[] words = text.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (int i = 0; i <= words.length - 1; i++) {
            if (hashMap.containsKey(words[i])) {
                int counter = hashMap.get(words[i]);
                hashMap.put(words[i], counter + 1);
            } else {
                hashMap.put(words[i], 1);
            }
        }
        System.out.println(hashMap);
    }

    /**
     * заменить символ " * " в строке "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро." на символ "а"
     */
    public void replaceSymbol() {
        String st = "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро.";
        System.out.println(st.replace('*', 'а'));
    }

    /**
     * удалить символ '! ' в строке "Работать нужно не 12 часов, а головой!"
     */
    public void deleteSymbol() {
        String st = "Работать нужно не 12 часов, а головой!";
        System.out.println(st.replaceFirst(".$", ""));
    }

    /**
     * вывести строку "Работать нужно не 12 часов, а головой!" 3 раза с разделителем
     */
    int count = 0;

    public void withdrawThreeTimes() {
        if (count < 3) {
            System.out.println("Работать нужно не 12 часов, а головой!");
            count++;
            withdrawThreeTimes();
        }
    }

    /**
     * написать метод который определяет является ли строка "Аргентина манит негра" палиндромом
     */

    public void palindrom() {
        String text = "Аргентина манит негра";
        String string = text.replaceAll(" ", "");
        StringBuffer stringBuffer = new StringBuffer(string);
        String data = stringBuffer.reverse().toString();
        if (string.equalsIgnoreCase(data)) {
            System.out.println("Палиндромом");
        } else {
            System.out.println("Не палиндромом");
        }
    }

    /**
     * Подсчитать сколько раз символ 'В' встречается в строке 'Работать нужно не 12 часов, а головой!', учитывая различные раскладки
     */
    public void countB() {
        String b = "В";
        String text = "Работать нужно не 12 часов, а головой!";
        String[] lines = text.split("");
        int count = 0;
        for (int i = 0; i < lines.length; i++) {
            if (b.equalsIgnoreCase(lines[i])) {
                count = ++count + 0;
            }
        }
        System.out.println("Символ " + b + " встречается " + count + " раз(а).");
    }

    /**
     * вычислить факториал
     */

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
