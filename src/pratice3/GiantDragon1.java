package pratice3;

public class GiantDragon1 {
    private GiantDragon1(){
    }

    //类属性，  用于指向一个实例化对象，但是暂时指向null
    public static GiantDragon1 instance;

    //public static 方法，返回实例对象
    public static GiantDragon1 getInstance(){

        //第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
        if(null==instance){
            instance =new GiantDragon1();
        }
        return instance;
    }

}
