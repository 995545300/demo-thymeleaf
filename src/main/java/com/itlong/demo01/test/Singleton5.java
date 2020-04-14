package com.itlong.demo01.test;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 单例模式之cas实现
 * 缺点;会产生垃圾对象
 */
public class Singleton5 {
    private static AtomicReference<Singleton5> atomicReference=new AtomicReference<>();
    private  Singleton5(){

    }
    public static Singleton5 getInstance(){
        for (;;) {
            Singleton5 singleton5 = atomicReference.get();
            if (singleton5 != null) {
                return singleton5;
            }
            singleton5 = new Singleton5();
            /**
             * expect 判断的值
             * sigleton5是新值
             * 如果旧值和expect一致就更新为新值
             */
            if (atomicReference.compareAndSet(null, singleton5)) {
                return singleton5;
            }
        }
    }
}
