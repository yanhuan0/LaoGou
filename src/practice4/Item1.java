package practice4;

public class Item1 {
    public String name;
    private float hp;
    public float price;

    public String toString(){
        return name;
    }

    public void finalize(){
        System.out.println("这个英雄正在收回");
    }

    public boolean equals(Object o){
        if (o instanceof Item1){
            Item1 i=(Item1) o;
            return this.price==i.price;
        }
        return false;
    }
}
