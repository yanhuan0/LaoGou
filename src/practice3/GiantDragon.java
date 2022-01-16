package practice3;

public class GiantDragon {

    //私有化构造方法，使得类无法在外部通过new进行实例化
    private GiantDragon(){

    }

    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个
    public static GiantDragon instance=new GiantDragon();

    public static GiantDragon getInstance(){
        return instance;
    }
}
