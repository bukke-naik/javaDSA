package coding.info;
public class MaxLeetCodeEx {

    public static void main(String[] args) {
        int arr[]  = {9, 1, 3, -1, 5, 3, 6, 7};
        int k = 3;
        printMax(arr, arr.length,k);
    }

public static void printMax(int arr[], int n, int k){

        int j , max;
        for (int i=0; i<n-k;i++){

            max = arr[i];

            for (j=1;j<k;j++){

                if(arr[i+j]>max)
                    max =arr[i+j];

            }
            System.out.print(max+"");
        }
}

}
