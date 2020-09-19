package com.story.designpatterns.chainofresponsibitily.servlet.v1;

import java.util.ArrayList;
import java.util.List;

public class ServletMain {
    public static void main(String[] args) {
        Request_ request = new Request_();
        request.str = "<script><h1>xo哇咔咔</h1></script>";
        Response_ response = new Response_();
        response.str = "";

        FilterCHain fc = new FilterCHain();
        fc.add(new HTMLFilter()).add(new SensitiveFilter());
        fc.doFilter(request,response);
        System.out.println(request.str);
    }
}

interface Filter_{
    boolean doFilter(Request_ request_,Response_ response_);
}

class HTMLFilter implements Filter_{

    @Override
    public boolean doFilter(Request_ request_, Response_ response_) {
        request_.str = request_.str.replace("<","[").replace(">","]");
        return true;
    }
}

class SensitiveFilter implements Filter_{

    @Override
    public boolean doFilter(Request_ request_, Response_ response_) {
        request_.str = request_.str.replace("xo","good good study");
        return true;
    }
}

class FilterCHain implements  Filter_{
    private List<Filter_> filters = new ArrayList<>();

    public FilterCHain add(Filter_ f){
        filters.add(f);
        return this;
    }

    @Override
    public boolean doFilter(Request_ request_, Response_ response_) {
        for (Filter_ f: filters) {
            f.doFilter(request_,response_);
        }
        return true;
    }
}

class Request_{
    String str;
}

class Response_{
    String str;
}