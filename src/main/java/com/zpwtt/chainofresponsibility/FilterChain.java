package com.zpwtt.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤链
 * @author zhuangpeng
 */
public class FilterChain implements Filter {

    private List<Filter> filters = new ArrayList<>();
    private int index = 0;

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, filterChain);
    }
}
