package com.itlong.demo01.test;

/**
 * 单例模式之懒汉式
 */
public class Singletan4 {
    //volatile 防止指令重排
    private static volatile Singletan4 singletan4=null;
    private Singletan4(){

    }

    /***
     * 双重检查锁防止多线程下创建实例
     * @return
     */
    public static Singletan4 getInstance(){
        if(singletan4==null){
            synchronized (Singletan4.class){
                if(singletan4==null){
                    singletan4=new Singletan4();
                }
            }
        }
        return singletan4;
    }

}
