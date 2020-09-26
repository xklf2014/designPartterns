package com.story.designpatterns.facade.v1;

public class Client {
    public static void main(String[] args) {
        LetterProcess process = new LetterProcessImpl();

        process.writeContext("Hello,It's me,do you know who I am?");
        process.fillEnvelope("Happy Road No. 666,God Province,Heaven");
        process.letterIntoEnvelope();
        process.sendLetter();
    }

}


