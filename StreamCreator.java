package com.company;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreator {

    public static void main(String[] args) {

        Stream<Integer> streamOfValues = Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 90);
        streamOfValues.forEach(System.out::println);


        Stream<String> streamStringTokens = Stream.of("A#L#EK#SAN#DRIA".split("#"));
        streamStringTokens.forEach(e -> System.out.println(e));


        IntStream streamStringChars = "Adiugjtjgtjgl34_fg".chars();
        streamStringChars.forEach(System.out::println);


        String[] regularArray = {"a", "b", "c", "d"};
        Stream<String> streamFromStringArray = Arrays.stream(regularArray);
        streamFromStringArray.forEach(e -> System.out.println(e));


        Stream<Integer> streamOfArray = Stream.of(new Integer[]{10, 20, 30, 40, 50, 60, 70, 80, 90});
        streamOfArray.forEach(System.out::println);


        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) { list.add(i); }
        Stream<Integer> streamOfArrayList = list.stream();
        streamOfArrayList.forEach(e -> System.out.println(e));


        Stream<Date> streamGenerate= Stream.generate(() -> new Date()).limit(2);
        streamGenerate.forEach(System.out::println);


        Stream.Builder<String> builderToCreateStream = Stream.builder();
        // Adding elements in the stream of Strings
        Stream<String> streamIntive;
        streamIntive = builderToCreateStream
                .add("i")
                .add("n")
                .add("t")
                .add("i")
                .add("v")
                .add("e")
                .build();
        // Iterate list first to last element
        Iterator<String> it = streamIntive.iterator();
        // Iterate stream object
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
