package com.story.designpatterns.chainofresponsibitily.servlet.v4;

import java.util.ArrayList;
import java.util.List;

public class ServletMain {
    public static void main(String[] args) {
        Request_ request = new Request_();
        request.str = "<script><h1>xo哇咔咔</h1></script>";
        Response_ response = new Response_();
        response.str = "response";

        FilterCHain fc = new FilterCHain();
        fc.add(new HTMLFilter()).add(new SensitiveFilter());
        System.out.print("request");
        fc.doFilter(request,response);
        System.out.println(request.str);
        System.out.println(response.str);
    }
}

interface Filter_{
    void doFilter(Request_ request_, Response_ response_, FilterCHain filterCHain);
}

class HTMLFilter implements Filter_ {

    @Override
    public void doFilter(Request_ request_, Response_ response_, FilterCHain chain) {
        System.out.print("--HTMLFilter");
        request_.str = request_.str.replace("<","[").replace(">","]");
        chain.doFilter(request_,response_);
        response_.str += "--HTMLFilter";
    }
}

class SensitiveFilter implements Filter_ {

    @Override
    public void doFilter(Request_ request_, Response_ response_, FilterCHain chain) {
        System.out.println("--SensitiveFilter");
        request_.str = request_.str.replace("xo","good good study");
        chain.doFilter(request_,response_);
        response_.str += "--SensitiveFilter";
    }
}

class FilterCHain {
    private List<Filter_> filters = new ArrayList<>();
    int index = 0;

    public FilterCHain add(Filter_ f){
        filters.add(f);
        return this;
    }

    public void doFilter(Request_ request_, Response_ response_) {
        if (index == filters.size()) return;
        Filter_ filter_ = filters.get(index);
        index++;

        filter_.doFilter(request_,response_,this);
    }
}

class Request_{
    String str;
}

class Response_{
    String str;
}