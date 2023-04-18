package main.java.string;

import java.util.Scanner;
/**
 * "Нужно написать метод, на вход которого подается число, нужно:
 * если число четное, вывести на экран сообщение, что это четное число
 * если число делится на 10, вывести одну десятую числа
 * если число делится на 3, вывести факториал этого числа
 * если выполняется несколько условий, выводим все соответствующие варианты"
 */

public class WriteMetodPage {

    public static void main(String[] args) {
        int m;
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            m = sc.nextInt();
            if (m == 0) {
                System.out.println("На ноль делить нельзя");
            } else if (m % 2 == 0 & m % 10 == 0) {
                double g = m / 10;
                System.out.println("Число четное " + "и число делится на 10 = " + g);
            } else if (m % 3 == 0) {
                int result = 1;
                for (int i = 1; i <= m; i++) {
                    result = result * i;
                }
                System.out.println(result);
            } else if (m % 10 == 0) {
                double k = m / 10;
                System.out.println(k);
            } else if (m % 2 == 0) {
                System.out.println("Число четное");
            } else if (m == 0) {
                System.out.println("На ноль делить нельзя");
            } else {
                System.out.println("Скорее всего, вы допустили ошибку");
            }
        }
    }
}



