package org.bigtech.generics.wildcards;

import java.util.Arrays;
import java.util.List;

/**
 * @author Guduru, Thirupathi Reddy
 */
public class WildCardExtendsDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<? extends Number> numbers = integers;
        numbers.forEach(e -> System.out.println(e));
    }
}
