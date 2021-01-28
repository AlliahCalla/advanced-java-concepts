package com.alliah.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show(){


        Stream.of(1,2,3,4);
        Stream.generate(() -> Math.random());

        Stream.iterate(1,n -> n + 1)
                .limit(10)
                .forEach(n -> System.out.println(n));


    }
}
