public class YanHuan implements  Runnable{
    public String story;
    public YanHuan(String s){
         this.story =s;
    }
    public void run(){
        for (int i = 0 ; i < this.story.toCharArray().length;i++){
            char c = this.story.toCharArray()[i];
            System.out.print(c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
