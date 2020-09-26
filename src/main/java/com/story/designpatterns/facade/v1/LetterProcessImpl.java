package com.story.designpatterns.facade.v1;

public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容:"+context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人姓名以及地址："+address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放到信封中...");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信件...");
    }
}
