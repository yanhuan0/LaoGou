package com;

public class Hero2 {

    String name;
    float hp;
    float hj;
    int sd;

    //获取护甲值
    float getHj(){
        return hj;
    }

    //坑队友
    void keng(){
        System.out.println("坑队友");
    }

    //增加移动速度
    void addSpeed(int speed){
        sd=sd+speed;
    }

    //超神无参数
    void legendary(){
        System.out.println("超神");
    }

    float getHp(){
        return hp;
    }

    void recovery(float blood){
        hp = hp+blood;
    }

    public static void main(String[] args) {
        Hero2 garen = new Hero2();
        garen.name="盖伦";
        garen.sd = 350;
        garen.addSpeed(200);
    }
}
