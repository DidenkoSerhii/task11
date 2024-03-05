package org.apache;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OutputOfOddNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Mary");
        names.add("Peter");
        names.add("Alex");

        String result = names.stream()
                .filter(name -> names.indexOf(name) % 2 == 1)
                .map(name -> names.indexOf(name) + ". " + name)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}