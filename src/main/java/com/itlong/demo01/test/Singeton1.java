package com.itlong.demo01.test;

import java.io.Serializable;

/**
 * 单例模式-----饿汉式
 * 加载类的时候就会创建实例
 */
public class Singeton1 implements Serializable {
    /**
     * 拥有类属性
     */
   private  static Singeton1 singeton1=new Singeton1();
    /**
     * 获取实例的公共静态方法
     * @return
     */
    public static Singeton1 getInstance(){
        return singeton1;
    }
    /**
     * 构造器私有化
     */
    private Singeton1(){

    }

   private Object readResolve(){
        return  singeton1;
   }

}
