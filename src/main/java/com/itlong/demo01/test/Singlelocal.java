package com.itlong.demo01.test;

/**
 * ThreadLocal实现单例模式  ，只能保证单线程中的单例
 */
public class Singlelocal {

    private Singlelocal singlelocal=null;

    private  static  final  ThreadLocal<Singlelocal> threadLocal=new ThreadLocal<Singlelocal>(){
        @Override
        protected Singlelocal initialValue() {
            return new Singlelocal();
        }
    };
    private Singlelocal(){

    }
    public static Singlelocal getInstance(){
           return threadLocal.get();
    }
}
