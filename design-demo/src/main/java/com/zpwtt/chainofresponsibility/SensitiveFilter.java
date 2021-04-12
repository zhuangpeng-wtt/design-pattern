package com.zpwtt.chainofresponsibility;

/**
 * @author zhuangpeng
 */
public class SensitiveFilter implements Filter{

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("SensitiveFilter--request");
        filterChain.doFilter(request, response, filterChain);
        System.out.println("SensitiveFilter--response");
    }
}
