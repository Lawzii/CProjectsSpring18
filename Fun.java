import java.util.ArrayList;
import java.util.Collections;

public class Fun {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //ArrayList<String>

        list.add(85);
        list.add(42);
        list.add(74);
        list.add(56);

        System.out.println(list);
        Collections.sort(list); // import Collections
        System.out.println(list);

        int var = list.remove(1); //will carry out .remove then assign it to var
        System.out.println(list);
        System.out.println(var); //prints out what was removed at referenced spot 1

    /* AutoBoxing */

        Integer myVar = 23;

        String value = myVar.toString(); // allows you to assign the INT 42 as a STRING 
        int myVar2= 24; 
        System.out.println(value);
        /* value = myVar2; Would produce an error since you cannot convert a STRING to INT w/o auto boxing
        System.out.println(value); */

    /* Sorting */
        /* Quick Sort */
        //17, 41, 5, 22, 54, 6, 29, 3, 13

        /* right < pivot
        left > pivot
        if(true) swap */
        
        /*Merge Sort? */
        //10, 6, 8, 5, 7, 3, 4
        /* 10 6 8 5   |  7 3 4
        10 6  |  8 5  |   7 3  4
        6 10  |  5 8   |  3 7  4
        5 6 8 10  |  3 4 7
        then 3 4 5 6 7 8 10 */

    }


}