package com.xincl.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * 设置UUID，随机字符串
 */
public class IDUtils {
    public static String getID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void testGetUUID(){
        System.out.println(IDUtils.getID());
        System.out.println(IDUtils.getID());
        System.out.println(IDUtils.getID());

    }

}
