package com.story.designpatterns.interpreter.zen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String,Integer> var =getValue(expStr);

        Calculator calc = new Calculator(expStr);
        System.out.println("运算结果为:"+expStr+"="+calc.run(var));

    }

    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式:");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static HashMap<String,Integer> getValue(String expStr) throws IOException {
        HashMap<String,Integer> map = new HashMap<>();
        for (char ch : expStr.toCharArray()){
            if (ch != '+' && ch != '-'){
                if (!map.containsKey(String.valueOf(ch))){
                    System.out.print("请输入"+ch+"的值:");
                    String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    map.put(String.valueOf(ch),Integer.valueOf(line));
                }
            }
        }
        return map;
    }
}
