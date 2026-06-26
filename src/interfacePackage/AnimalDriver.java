package interfacePackage;

public class AnimalDriver {

    static void main(String[] args) {

        AnimalChild ac=new AnimalChild();
        System.out.println(AnimalChild.name);

        ac.sound();
        ac.name();
    }
}
