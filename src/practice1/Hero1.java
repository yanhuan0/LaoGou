package practice1;
public class Hero1 {

    String name;   //姓名
    float hp;   //血量
    float hj;   //护甲
    int sd;  //移动速度

    public Hero1(String name1,float hp1,float hj1,int sd1){
//        this.name=name1;

        this.name = name1;
        this.hp=hp1;
        this.hj=hj1;
        this.sd=sd1;

    }

    public void print(){

        System.out.println(this.name+"血量"+this.hp+"护甲"+this.hj+"移动速度"+this.sd);
    }

    public String getName(){

        return this.name;
    }

    public static void main(String[] args) {
        Hero1 gailun= new Hero1("盖伦",616.28f,27.536f,350);
        gailun.print();
        System.out.println(gailun.getName());

        Hero1  timo = new Hero1("提莫",383f,14f,330);
        timo.print();
        System.out.println(timo.getName());
    }

}

