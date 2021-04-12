package com.zpwtt.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        Request request = new Request("request msg");
        Response response = new Response("response msg");

        FilterChain filterChain = new FilterChain();
        filterChain.add(new SensitiveFilter()).add(new HTMLFilter());
        filterChain.doFilter(request, response, filterChain);
    }
}
