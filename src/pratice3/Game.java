package pratice3;

public class Game {

    private Game(){

    }
//    public static Game a=new Game();


//    public static Game getInstance(){
//      return a;
//    }


    public static Game a;
    public static Game getInstance(){
        if(a==null){
             a=new Game();
        }
        return a;
    }
}
