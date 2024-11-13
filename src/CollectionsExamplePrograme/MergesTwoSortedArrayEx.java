package CollectionsExamplePrograme;

import java.util.Arrays;

public class MergesTwoSortedArrayEx {
    private static int[] mergedArray(int[] arrayA , int[] arrayB){
        int [] mergedArray = new int[arrayA.length+arrayB.length];
        int i=0, j=0,k=0;

        while(i<arrayA.length){

            mergedArray[k]=arrayA[i];
            i++;
            k++;
        }
        while (j<arrayB.length){

            mergedArray[k]=arrayB[j];
            j++;
            k++;
        }

        Arrays.sort(mergedArray);
        return  mergedArray;
    }

    public static void main(String[] args) {

        int[] arrayA = new int[]{1,3,4,5,6,2,56,34,0};
        int[] arrayB = new int[]{109,234,645};

        int[] mergedArray = mergedArray(arrayA,arrayB);

        System.out.println("Array A is "+ Arrays.toString(arrayA));
        System.out.println("array B"+Arrays.toString(arrayB));
        System.out.println("merged Arrays"+Arrays.toString(mergedArray));

    }
}
