package org.apache;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersParser {
    public static void main(String[] args) {
        String[] input = {"1, 2, 0", "4, 5"};
        List<Integer> numbers = Arrays.stream(input)
                .flatMapToInt(s -> Arrays.stream(s.split(", "))
                        .mapToInt(Integer::parseInt))
                .boxed()
                .toList();

        String result = numbers.stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}