package coingTest;

public class CardProblemEx {
    public static void main(String[] args) {
       // int[] card = {1, 2, 3, 4, 5, 6, 1};
        // //  int k = 3;

//       int [] card = {2,2,2};
//       int k = 2;


        //Output: 4
        //t:
        int [] cardPoints = {9,7,7,9,7,7,9};
        int  k = 7;


        //55

        System.out.println(maxScore(cardPoints, k)); // Output: 12
    }

    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int maxScore = 0;

        // Calculate score by taking i cards from the left and (k-i) cards from the right
        for (int i = 0; i <= k; i++) {
            int leftSum = 0;
            int rightSum = 0;

            // Sum of the left part
            for (int j = 0; j < i; j++) {
                leftSum += cardPoints[j];
            }

            // Sum of the right part
            for (int j = 0; j < (k - i); j++) {
                rightSum += cardPoints[n - 1 - j];
            }

            maxScore = Math.max(maxScore, leftSum + rightSum);
        }

        return maxScore;
    }
}