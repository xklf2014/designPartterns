package com.story.designpatterns.command;

public class CopyCommand extends Command {
    Content content;

    public CopyCommand(Content content) {
        this.content = content;
    }

    @Override
    public void exec() {
        content.msg += content.msg;
    }

    @Override
    public void undo() {
        content.msg = content.msg.substring(0, content.msg.length() / 2);
    }
}
