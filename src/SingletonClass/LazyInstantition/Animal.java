package SingletonClass.LazyInstantition;

public class Animal {

    static  int x=20;

    public  static  Animal a=null;

    public  static  Animal getInstance(){
        if(a==null){
            a=new Animal();
        }

        return a;
    }


    public void animalSound(){
        System.out.println("Sound is missing");
    }
}
