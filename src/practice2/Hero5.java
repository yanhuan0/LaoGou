package practice2;

public class Hero5 {
    String heroName;
    float heroHp;
    float heroArmor;
    int heroMoveSpeed;

    public Hero5(String heroName1,float heroHp1,float heroArmor1,int heroMoveSpeed1){
        this.heroName=heroName1;
        this.heroHp=heroHp1;
        this.heroArmor=heroArmor1;
        this.heroMoveSpeed=heroMoveSpeed1;
    }

    public static void main(String[] args) {
        Hero5 haren=new Hero5("海伦",32,25,30);
        System.out.println(haren.heroName+ '\n'+haren.heroHp+'\n'+haren.heroArmor+'\n'+ haren.heroMoveSpeed);
    }
}
