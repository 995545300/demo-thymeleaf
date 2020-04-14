package com.itlong.demo01.test;

/**
 * 单例模式之枚举式
 * 本身就防止反射，防止序列化创建实例
 */
public enum Singleton3 {
    INSTANCE{
        @Override
        protected void doSomething() {
            System.out.println("doSomeThing");
        }
    };
    protected  abstract void doSomething();
}
