package com.story.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Content content = new Content();

        Command insert = new InsertCommand(content);
        insert.exec();
        insert.undo();
        //System.out.println(content.msg);

        Command copy = new CopyCommand(content);
        copy.exec();
        copy.undo();
        //System.out.println(content.msg);

        Command del = new DeleteCommand(content);
        del.exec();
        del.undo();
        System.out.println(content.msg);

        List<Command> commands = new ArrayList<>();
        commands.add(insert);
        commands.add(copy);
        commands.add(del);

        for (Command c : commands) {
            c.exec();
        }
        System.out.println("---------exec------------");
        System.out.println(content.msg);
        System.out.println("---------undo------------");
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
        System.out.println(content.msg);
    }
}
