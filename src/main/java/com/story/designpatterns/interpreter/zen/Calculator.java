package com.story.designpatterns.interpreter.zen;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
    //定义的表达式
    private Expression expression;

    //构造函数传参,并解析
    public Calculator(String expStr) {
        //定义一个堆栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        //表达式拆分为字符数组
        char[] chars = expStr.toCharArray();
        Expression left = null;
        Expression right = null;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    //加法结果放到堆栈中
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    //公式中的变量
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        //把运算结果抛出来
        this.expression = stack.pop();
    }

    //开始运算
    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
