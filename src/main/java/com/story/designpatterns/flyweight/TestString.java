package com.story.designpatterns.flyweight;

public class TestString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        String s5 = "a" + "bc";

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s3.intern());
    }
}
