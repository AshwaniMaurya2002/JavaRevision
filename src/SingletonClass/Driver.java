package SingletonClass;

public class Driver {
    static void main(String[] args) {

        Browser b=Browser.getInstance();

        System.out.println(Browser.x);
        b.getName();
        System.out.println(b);

        Browser b1=Browser.getInstance();
        System.out.println(b1);
    }
}
