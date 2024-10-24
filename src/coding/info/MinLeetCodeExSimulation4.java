package coding.info;

public class MinLeetCodeExSimulation4 {

        public static void main(String[] args) {
            int arr[]  = {9, 1, 3, -1, 5, 3, 6, 7};
            int k = 3;
            printMin(arr, arr.length,k);
        }

        public static void printMin(int arr[], int n, int k){

            int j , min;
            for (int i=0; i>n-k;i++){

                min = arr[i];

                for (j=1;j>k;j++){

                    if(arr[i+j]<min)
                        min =arr[i+j];

                }
                System.out.print(min+"");
            }
        }

    }

