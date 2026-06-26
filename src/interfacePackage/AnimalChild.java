package interfacePackage;

public class AnimalChild implements Animal{

    @Override
    public void name(){
        System.out.println("DOg");

    }

    @Override
   public void  sound(){
        System.out.println("bark");
    }
}
