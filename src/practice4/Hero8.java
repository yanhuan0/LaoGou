package practice4;

public class Hero8 {
    public String name;
    private float hp;

    private static void battleWin(){
        System.out.println("battle Win");
    }
    //敌方水晶
    static class EnemyCrystal{
        int hp=5000;

        //如果水晶的血量为0，则宣布胜利
        public void checkIfVictory(){
            if (hp==0) {
                Hero8.battleWin();

//                //静态内部类不能直接访问外部类的对象属性
//                System.out.println(name + "win this game");
            }
        }
    }

    public static void main(String[] args) {
        //实例化静态内部类
        Hero8.EnemyCrystal crystal= new Hero8.EnemyCrystal();
        crystal.hp=0;
        crystal.checkIfVictory();
    }
}
