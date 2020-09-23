package com.story.designpatterns.command;

public class InsertCommand extends Command {
    Content content;
    String str = "insert str";

    public InsertCommand(Content content) {
        this.content = content;
    }

    @Override
    public void exec() {
        content.msg = content.msg + str;
    }

    @Override
    public void undo() {
        content.msg = content.msg.substring(0, content.msg.length() - str.length());
    }
}
