package com.zpwtt.strategy;

import java.util.Arrays;

/**
 * @author zhuangpeng
 */
public class SorterMain {

    /**
     * 开闭原则
     * 程序对修改关闭,对扩展开放
     *
     * @param args
     */
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(3, 3), new Dog(1, 1), new Dog(5, 5)};
        Sorter<Dog> sorter = new Sorter<>();
        sorter.sort(dogs, new DogComparator());
        System.out.println(Arrays.toString(dogs));
    }
}
