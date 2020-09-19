package com.story.designpatterns.chainofresponsibitily.servlet.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

public class ServletMain {
    public static void main(String[] args) {
        Request_ request = new Request_();
        request.str = "<script><h1>xo哇咔咔</h1></script>";
        Response_ response = new Response_();
        response.str = "response";

        FilterCHain fc = new FilterCHain();
        fc.add(new HTMLFilter()).add(new SensitiveFilter());
        System.out.print("request");
        fc.doFilter(request,response,fc);
        System.out.println(request.str);
        System.out.println(response.str);
    }
}

interface Filter_{
    boolean doFilter(Request_ request_, Response_ response_,FilterCHain filterCHain);
}

class HTMLFilter implements Filter_ {

    @Override
    public boolean doFilter(Request_ request_, Response_ response_,FilterCHain chain) {
        System.out.print("--HTMLFilter");
        request_.str = request_.str.replace("<","[").replace(">","]");
        chain.doFilter(request_,response_,chain);
        response_.str += "--HTMLFilter";
        return true;
    }
}

class SensitiveFilter implements Filter_ {

    @Override
    public boolean doFilter(Request_ request_, Response_ response_,FilterCHain chain) {
        System.out.println("--SensitiveFilter");
        request_.str = request_.str.replace("xo","good good study");
        chain.doFilter(request_,response_,chain);
        response_.str += "--SensitiveFilter";
        return true;
    }
}

class FilterCHain implements Filter_ {
    private List<Filter_> filters = new ArrayList<>();
    int index = 0;

    public FilterCHain add(Filter_ f){
        filters.add(f);
        return this;
    }

    @Override
    public boolean doFilter(Request_ request_, Response_ response_, FilterCHain chain) {
        if (index == filters.size()) return false;
        Filter_ filter_ = filters.get(index);
        index++;
        return filter_.doFilter(request_,response_,chain);
    }
}

class Request_{
    String str;
}

class Response_{
    String str;
}