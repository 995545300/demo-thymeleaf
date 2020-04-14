package com.itlong.demo01.test.suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * 找出字符串中出现最多的字符
 */
public class StrDemo2 {
    public static void main(String[] args) {
        String a="abbsdkkkskks";
        int maxCount=0;
        char maxStr=a.charAt(0);
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char s=a.charAt(i);
            Integer count=map.get(s);
           if(count==null){
             count=1;
           }else{
               count++;
           }
            map.put(s,count);
           if(count>maxCount){
               maxCount=count;
               maxStr=s;
           }
        }
        System.out.println(maxStr+"-"+maxCount);
    }
}
