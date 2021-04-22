package com.zpwtt.chainofresponsibility;

public interface Filter {

    void doFilter(Request request, Response response, FilterChain filterChain);
}
