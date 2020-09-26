package com.story.designpatterns.facade.v2;

import com.story.designpatterns.facade.v1.LetterProcess;
import com.story.designpatterns.facade.v1.LetterProcessImpl;

public class ModenPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
