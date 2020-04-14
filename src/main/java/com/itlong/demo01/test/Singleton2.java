package com.itlong.demo01.test;

/**
 * 单例模式之 登记式
 * 加载类的时候不会创建实例
 */
public class Singleton2 {
    /**
     * 静态内部类
     */
    private static class Singleton2Holder{
        /**
         * 拥有类的变量
         */
        private static Singleton2 singleton2=new Singleton2();
    }
    /**
     * 构造器私有化
     * 为了方式反射构造出实例，在这需要判断空来防止
     */
    private Singleton2(){
        //如果已经存账该实例就抛出异常，防止反射构造实例
        if(Singleton2Holder.singleton2!=null){
            throw new IllegalStateException();
        }

    }

    /**
     * 获取类实例的静态方法
     * @return
     */
    public static Singleton2 getInstance(){
       return  Singleton2Holder.singleton2;
    }

    /**
     * 防止反序列化构造实例
     * @return
     */
    private  Object readResolve(){
        return Singleton2Holder.singleton2;
    }
}
