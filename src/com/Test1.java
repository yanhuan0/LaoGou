package com;

import java.net.SocketOption;
//>>TODO
//2.769343
//        365
//        12
//        '吃'
//        false
//        "不可描述"
public class Test1 {
    public static void main(String[] args) {
        double a =3.14;
        System.out.println(a);

        float a1 =3.14f;

//        float a2 =(double) 2.769343;
        float a2 = 2.769343f;

        a=a2;
        int a3=365;
        byte a4=12;
        
        char a5='吃';
        
        boolean a6 =false;
        
        String a7="不可描述";
//        char c = 'A';
//        char c = 'a';
//        System.out.println(c);

        int n = 100;
        System.out.println(n);

        char  c1 = (char) n;
        System.out.println(c1);
    }
}
