package SingletonClass;

public class Browser {

    //Eager Instantion
    static  int x=10;
    public  static  Browser b=new Browser();
    public  static  Browser getInstance(){
        return b;

    }
    public  void getName(){
        System.out.println("my name is Browser");
    }
}
