package DSA.Arrays;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraysSort {


    static void main(String[] args) {

    ArrayList<Integer> arr=new ArrayList<>(List.of(1,3,32523,52,4,324,0,24,32));
        Collections.sort(arr);
        for (Integer x: arr)
        {
            System.out.println(x);
        }
    }


}
