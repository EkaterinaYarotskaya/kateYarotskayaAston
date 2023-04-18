package main.java.Straem;

import java.util.stream.Stream;

/**
 * 2.2.Написать методы, который четные числа умножает на 100, а от нечетных отнимает 100 и возвращает коллекцию.
 * Количество принимаемых и возвращаемых элементов коллекций должно совпадать
 */
public class Numbers {

    public static void main(String[] args) {
        Stream.of("44, 77, 66, 35".split(", "))
                .mapToInt(Integer::parseInt)
                .map(x -> x % 2 == 0 ? x * 100 : x - 100)
                .forEach(System.out::println);
    }
}
