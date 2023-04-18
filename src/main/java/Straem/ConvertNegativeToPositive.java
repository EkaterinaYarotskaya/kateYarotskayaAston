package main.java.Straem;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 2.1. Создать коллекцию целых чисел, написать методы:
 * Который отрицательные числа делает положительными и возвращает коллекцию ([1, 5, -3, 7] -> [1, 5, 3, 7])
 */

public class ConvertNegativeToPositive {

    public static void main(String[] args) {
        List<Integer> collect = Stream.of(1, 5, -3, 7)
                .map(x -> x < 0 ? -x : x)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
