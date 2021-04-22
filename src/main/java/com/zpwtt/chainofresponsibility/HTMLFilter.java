package com.zpwtt.chainofresponsibility;

/**
 * @author zhuangpeng
 */
public class HTMLFilter implements Filter{

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("HTMLFilter--request");
        filterChain.doFilter(request, response, filterChain);
        System.out.println("HTMLFilter--response");
    }
}
