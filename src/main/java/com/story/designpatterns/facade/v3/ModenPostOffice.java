package com.story.designpatterns.facade.v3;

import com.story.designpatterns.facade.v1.LetterProcess;
import com.story.designpatterns.facade.v1.LetterProcessImpl;

public class ModenPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();
    private Police police = new Police();

    public void sendLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        police.checkLetter();
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
