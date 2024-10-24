package coding.info;

public class RemoveStars {
    public static void main(String[] args) {
        //String s = "leet**cod*e";// Example input
//        String s = "erase*****";
        //  String s ="Govardhan****";
         String s="Apexon*";
        String result = removeStars(s);
        System.out.println(result); // Output the result
    }

    public static String removeStars(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                // If we encounter a star, remove the last character added to the result (if any)
                //Purpose: This line checks if the current character (ch) is a star (*). If it is, we need to handle the removal operation.
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                // If it's not a star, add it to the result
                result.append(ch);
            }
        }

        return result.toString();
    }
}