package main.java.string;

import static main.java.string.Anagramm.anagrama;
import static main.java.string.Fibonachi.enter;
import static main.java.string.StringPage.factorial;

public class Task {

    public static void main(String[] args) {

        StringPage page = new StringPage();

        System.out.println(" Перевернуть строку «Никогда не ошибается тот, кто ничего не делает»," +
                " изменив расположение символов в строке задом наперёд без использования встроенной в String функции reverse().");
        page.stringTurnOver();

        System.out.println("\n Подсчитать количество конкретных слов в строке 'Упади семь раз и восемь раз поднимись', используя HashMap.");
        page.hashMap();

        System.out.println("\nЗаменить символ '*'в строке 'Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро.' на символ 'а' ");
        page.replaceSymbol();

        System.out.println("\nУдалить символ '!' в строке 'Работать нужно не 12 часов, а головой!'");
        page.deleteSymbol();

        System.out.println("\nПодсчитать сколько раз символ 'В' встречается в строке 'Работать нужно не 12 часов, а головой!'," +
                " учитывая различные раскладки");
        page.countB();

        System.out.println("\nВывести строку 'Работать нужно не 12 часов, а головой!' 3 раза с разделителем");
        page.withdrawThreeTimes();

        System.out.println("\nНаписать метод который определяет является ли строка 'Аргентина манит негра' палиндромом");
        page.palindrom();

        System.out.println("\nНаписать метод который определяет является ли слово анаграммой (обезьянство, место, мечеть)");
       anagrama();

        System.out.println("\nВычислить число Фибоначчи");
        enter();

        System.out.println("Вычислить факториал");
        factorial();

    }
}
