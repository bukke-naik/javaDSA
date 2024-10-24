package coding.info;

import java.util.*;

public class MinimumLoss {
    public static void main(String[] args) {
        // Example input: projected prices for the house
        int[] prices = {10, 1, 2, 3, 4, 5, 6};

        int minLoss = minimumLoss(prices);
        System.out.println("Minimum financial loss: " + minLoss);
    }

    public static int minimumLoss(int[] prices) {
        int minLoss = Integer.MAX_VALUE;
        Map<Integer, Integer> priceIndexMap = new HashMap<>();

        // Store prices and their corresponding indices in a map
        for (int i = 0; i < prices.length; i++) {
            priceIndexMap.put(prices[i], i);//prices[i]: The current price from the prices array (at index i).
           // i: The index of the current price in the array.
        }

        // Sort prices to evaluate potential losses
        Arrays.sort(prices);

        // Iterate through sorted prices to find the minimum loss
        for (int i = 0; i < prices.length - 1; i++) {
            // Find the current price and its index
            int currentPrice = prices[i];
            int currentIndex = priceIndexMap.get(currentPrice);

            // Check the next higher price in sorted array
            for (int j = i + 1; j < prices.length; j++) {
                int nextPrice = prices[j];
                int nextIndex = priceIndexMap.get(nextPrice);

                // Ensure the buying year is before the selling year
                if (currentIndex < nextIndex) {
                    int loss = currentPrice - nextPrice;
                    if (loss < 0) { // We want to incur a loss
                        minLoss = Math.min(minLoss, -loss);
                    }
                    break; // No need to check further, as prices are sorted
                }
            }
        }

        return minLoss == Integer.MAX_VALUE ? -1 : minLoss; // Return -1 if no loss possible
    }
}
