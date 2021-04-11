package com.zpwtt.mediator;

import java.util.Date;

/**
 * @author zhuangpeng
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
