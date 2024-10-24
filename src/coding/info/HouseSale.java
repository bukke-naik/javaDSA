package coding.info;

public class HouseSale {
    public static void main(String[] args) {
        //  int[] price = {5,10,3};
        int[] price = {9, 1, 3, -1, 5, 3, 6, 7};
        System.out.println(minimumLose(price));
//        System.out.println(minimumLose(price));
    }

    public static int minimumLose(int[] price) {
        int minLose = Integer.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            for (int j = i + 1; j < price.length; j++) {
                if (price[i] > price[j]) {
                    int lose = price[i] - price[j];
                    minLose = Math.min(minLose, lose);
                }
            }
        }
        return minLose;

    }

    public static int maximumLoss(int[] price) {
        int maxLoses = Integer.MAX_VALUE;
        for (int k = 0; k < price.length; k++) {
            for (int l = 0; l < price.length; l++) {

                if (price[k] < price[l]) {

                    int maxLoses1 = price[l] - price[k];
                    maxLoses = Math.max(maxLoses, maxLoses1);
                }
            }
        }
        return maxLoses;

    }

}
