package com.story.designpatterns.adapter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //Adapter类是为了方便编程，不属于设计模式。

        InputStreamReader isr = new InputStreamReader(new FileInputStream(new File("e:/test.txt")));
        //BufferedReader无法直接接收FileInputStream，所以需要InputStreamReader这个适配器配合使用
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
        isr.close();
    }
}
