package practice4;

public class Child extends Parent{
    float price=3;

    public boolean equals(Parent p){
        if (p instanceof Child){
            Child c=(Child) p;
            return this.price==c.price;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
