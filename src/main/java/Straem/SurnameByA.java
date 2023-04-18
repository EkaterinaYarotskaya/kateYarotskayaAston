package main.java.Straem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 2.3. Есть стринговый лист фамилий, нужно пройтись по списку,
 * вытащить фамилии которые начинаются на А и поместить их в другой список для дальнейшей работы с ними
 */
public class SurnameByA {

    public static void main(String[] args) {
        List<String> list = Stream.of("Иванов", "Аронов", "Аванчук", "Петров", "Сидоров")
                .filter(name -> name.startsWith("А"))
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
