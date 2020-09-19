package com.story.designpatterns.chainofresponsibitily;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("hello,<scrpit>, -,- 欢迎学习chain of responsibility,xo");

        FilterChain fc = new FilterChain();
        fc.add(new HTMLFilter()).add(new SensitiveFilter());
        FilterChain fc2 = new FilterChain();
        fc.add(new FaceFilter());

        fc.add(fc2);
        fc.doFilter(msg);
        System.out.println(msg);
    }
}

class Msg{
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

interface Filter_{
    boolean doFilter(Msg msg);
}

class HTMLFilter implements  Filter_{

    @Override
    public boolean doFilter(Msg msg) {
        String str = msg.getMsg();
        str = str.replace('<','[');
        str = str.replace('>',']');
        msg.setMsg(str);
        return true;
    }
}

class SensitiveFilter implements Filter_{

    @Override
    public boolean doFilter(Msg msg) {
        String str = msg.getMsg();
        str = str.replace("xo","go go go");
        msg.setMsg(str);
        return true;
    }
}

class FaceFilter implements Filter_{

    @Override
    public boolean doFilter(Msg msg) {
        String str = msg.getMsg();
        str = str.replace("-,-","= =！");
        msg.setMsg(str);
        return true;
    }
}

class FilterChain implements Filter_{
    private List<Filter_> filters = new ArrayList<>();

    public FilterChain add(Filter_ filter_){
        filters.add(filter_);
        return this;
    }

    @Override
    public boolean doFilter(Msg msg) {
        for (Filter_ f : filters){
            if (!f.doFilter(msg)){
                return false;
            }
        }
        return true;
    }
}