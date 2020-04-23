package com.sk.stream;

import java.util.LinkedList;
import java.util.stream.Stream;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/4/22 14:26
 */
public class Test {

    public static void main(String[] args) {
        Stream.of("a","b","c","","e","f").dropWhile(s-> !s.isEmpty())
                .forEach(System.out::print);
    }
}
