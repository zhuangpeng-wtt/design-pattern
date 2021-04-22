package com.zpwtt.strategy;

/**
 * @author zhuangpeng
 */
public class DogComparator implements Comparator<Dog>{

    @Override
    public int compareTo(Dog o1, Dog o2) {
        return o1.height - o2.height;
    }
}
