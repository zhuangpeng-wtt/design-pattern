package com.zpwtt.decorator;

/**
 * @author zhuangpeng
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle of red border");
        redCircle.draw();

        System.out.println("Rectangle of red border");
        redRectangle.draw();
    }
}
