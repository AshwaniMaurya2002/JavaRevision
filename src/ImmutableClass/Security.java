package ImmutableClass;

public class Security {

     private final   int rollno;

    private  final String name;


    Security(int rollno, String name){
        this.name=name;
        this.rollno=rollno;
    }

    @Override
    public String toString() {
        return rollno+"  "+name;
    }
}
