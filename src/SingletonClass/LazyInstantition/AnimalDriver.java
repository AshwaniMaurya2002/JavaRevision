package SingletonClass.LazyInstantition;

public class AnimalDriver {
    static void main(String[] args) {
        Animal a=Animal.getInstance();
        a.animalSound();
        System.out.println(Animal.x);
    }
}
