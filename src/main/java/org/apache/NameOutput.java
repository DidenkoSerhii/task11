package org.apache;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class NameOutput {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Mary", "Peter", "John");
        List<String> sortedNames = sortAndCapitalize(names);
        System.out.println(sortedNames);
    }

    public static List<String> sortAndCapitalize(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}