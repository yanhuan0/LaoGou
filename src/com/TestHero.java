package com;

public class TestHero {
    String name;
    int beisha;     //送了多少次
    int sharen;     //杀人次数
    int zhugong;    //助攻次数
    float  money;      //金钱
    int budao;      //补刀数
    float gongji;   //攻击速度
    String sharenhou; //杀人后说的话
    String beishahou; //被杀后说的话

    public static void main(String[] args) {
        TestHero yase = new TestHero();
        yase.name="亚瑟";
        yase.beisha = 3;
        yase.sharen = 5;
        yase.zhugong=7;
        yase.money=3000f;
        yase.budao = 3;
        yase.gongji = 32.5f;
        yase.sharenhou="不得瑟了吧";
        yase.beishahou="我记住你了";
        System.out.println(yase.name+"送了"+yase.beisha+"次人头，杀了"+yase.sharen+"个人头助攻"+yase.zhugong+"次拿到了"+yase.money+"钱攻击速度"
                +yase.gongji+"杀人后说"+yase.sharenhou+"被杀后说"+yase.beishahou);
    }
}
