package main.java.Straem;

import java.util.stream.IntStream;

/**
 * написать метод, который найдет сумму нечетных чисел в коллекции
 */
public class Sum {

    public static void main(String[] args) {
        int count = IntStream.of(1, 2, 3, 8, 5, 6, 0, 4).filter(x -> x % 2 != 0).sum();
        System.out.println(count);
    }
}
