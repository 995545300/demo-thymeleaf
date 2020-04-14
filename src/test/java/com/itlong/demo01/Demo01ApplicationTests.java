package com.itlong.demo01;


import com.itlong.demo01.test.Singeton1;
import com.itlong.demo01.test.Singletan4;
import com.itlong.demo01.test.Singleton3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Constructor;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo01ApplicationTests {

    @Test
   public void contextLoads() throws Exception {
        /*Singeton1 singeton1=Singeton1.getInstance();
        Singeton1 singeton2=Singeton1.getInstance();


        System.out.println(singeton1==singeton2);
        Class clazz1=Singeton1.class;
        Constructor constructor1 = clazz1.getDeclaredConstructor();
        constructor1.setAccessible(true);
        Singeton1 s1=(Singeton1) constructor1.newInstance();
        Singeton1 s2=(Singeton1) constructor1.newInstance();
        System.out.println(s1==s2);

        Singleton3 singleton3=Singleton3.INSTANCE;

        Singleton3 singleton4=Singleton3.INSTANCE;
        System.out.println(singleton3==singleton4);
        Class clazz=Singleton3.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton3 s3=(Singleton3) constructor.newInstance();
        Singleton3 s4=(Singleton3) constructor.newInstance();
        System.out.println(s3==s4);*/

       /* Class clazz= Singletan4.class;
        Constructor declaredConstructor = clazz.getDeclaredConstructor();
        Singletan4 s1= (Singletan4) declaredConstructor.newInstance();
        Singletan4 s2= (Singletan4) declaredConstructor.newInstance();
        System.out.println(s1==s2);*/
        Singletan4 singletan4=Singletan4.getInstance();
        Singletan4 singletan5=Singletan4.getInstance();
        System.out.println(singletan4==singletan5);
    }

}
