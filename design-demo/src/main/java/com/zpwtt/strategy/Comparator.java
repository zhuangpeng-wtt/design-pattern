package com.zpwtt.strategy;

/**
 * 接口中只有一个方法的接口可称为函数式编程接口
 * 可以使用 Lamda 表达式
 * @author zhuangpeng
 */
@FunctionalInterface
public interface Comparator<T> {

    /**
     * 子定义比较器
     * o1 < o2 返回负数
     * o1 = o2 返回 0
     * o1 > o2 返回正数
     * @param o1
     * @param o2
     * @return
     */
    int compareTo(T o1, T o2);
}
