package com.itlong.demo01.test.suanfa;

/**
 *
 * 编程实现大数的加法
 *    例如：
 *    String a="123456777…"a.size 大于1000位
 *    String b="345678999…"b.size 大于1000位
 *
 *    实现思路：
 *    1.把俩大数转为字符数组
 *    2.个位数对齐相加，乘积放到新的int数组中
 *    3.然后在遍历新数组大于9的往上一个进一位
 *    4.理元StringBuilder进行字符拼接
 */
public class BigNumJia {
    public static void main(String[] args) {
        String a="1219999";
           String b="929111";


        char[] largeArray=null;
        char[] smallArray=null;

        if(a.length()>=b.length()){
            largeArray=a.toCharArray();
            smallArray=b.toCharArray();
        }else{
            largeArray=b.toCharArray();
            smallArray=a.toCharArray();
        }
        int [] result=new int[largeArray.length+1];

        for (int i = 0; i < largeArray.length; i++) {
            result[i]=largeArray[largeArray.length-i-1]-'0';

        }
        for (int i = 0; i < smallArray.length; i++) {
            result[i]+=smallArray[smallArray.length-i-1]-'0';

        }
       for (int i = 0; i < result.length; i++) {
           if(result[i]>9){
               result[i+1]+=result[i]/10;
               result[i]%=10;

           }
        }

        StringBuilder sb=new StringBuilder();
        for (int i = result.length-1; i >=0; i--) {
            /*if(i==result.length-1){
                if(result[i]>0){
                    sb.append(result[i]);
                }
            }else{
                sb.append(result[i]);
            }*/
            sb.append(result[i]);

        }
        String c=sb.toString();
        if(c.startsWith("0")){
            c=c.substring(1);
        }
        System.out.println(c);
        System.out.println(Integer.parseInt(a)+Integer.parseInt(b));

    }
}
