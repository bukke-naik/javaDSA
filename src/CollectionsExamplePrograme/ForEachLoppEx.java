package CollectionsExamplePrograme;

import java.util.ArrayList;

public class ForEachLoppEx {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,67,33,23,34,22,34,556,67};

        ArrayList<Integer> numbersEX = new ArrayList();


        for(int nub:numbers){

           // System.out.println("ierator number::"+nub);

            System.out.println("ArryList::"+numbersEX);
        }
    }
}
