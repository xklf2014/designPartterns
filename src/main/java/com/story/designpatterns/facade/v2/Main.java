package com.story.designpatterns.facade.v2;

public class Main {
    public static void main(String[] args) {
        ModenPostOffice postOffice = new ModenPostOffice();
        String context = "Happy Road No. 666,God Province,Heaven";
        String address = "Hello,It's me,do you know who I am?";
        postOffice.sendLetter(context,address);
    }
}
