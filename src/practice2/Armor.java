package practice2;

public class Armor extends Item{
    int ac;//护甲等级

    public static void main(String[] args) {
        Armor cloth = new Armor();
        cloth.name="布甲";
        cloth.price=300;
        cloth.ac=15;

        Armor cloth1=new Armor();
        cloth1.name="锁子甲";
        cloth1.price=500;
        cloth1.ac=40;
    }
}
