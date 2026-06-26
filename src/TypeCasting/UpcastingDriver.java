package TypeCasting;

public class UpcastingDriver {

    static void main(String[] args) {
        Upcasting a=new UpcastingA();
        a.sound();
        a.run();
        System.out.println(a.name);

    UpcastingA b=(UpcastingA) a;
        System.out.println(b.nameA);
        b.start();

    }
}
