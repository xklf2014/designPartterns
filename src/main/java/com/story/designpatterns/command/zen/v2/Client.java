package com.story.designpatterns.command.zen.v2;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        System.out.println("-------------客户要求增加一项需求-----------------");
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();

        Command deletePageCmd = new DeletePageCommand();
        invoker.setCommand(deletePageCmd);
        invoker.action();
    }
}
