package com.story.designpatterns.command;

public class DeleteCommand extends Command {
    Content content;
    String delStr;

    public DeleteCommand(Content content) {
        this.content = content;
    }

    @Override
    public void exec() {
        delStr = content.msg.substring(0, 3);
        content.msg = content.msg.substring(3);
    }

    @Override
    public void undo() {
        content.msg = delStr + content.msg;
    }
}
