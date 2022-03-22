package practice4;

public abstract class HeroTest {
    public abstract void attack();

    public static void main(String[] args) {
        final int damage=5;

        HeroTest h= new HeroTest() {
            public void attack() {
                System.out.printf("新的攻击手段，造成%d点伤害",damage);
            }
        };
        h.attack();
    }
}
