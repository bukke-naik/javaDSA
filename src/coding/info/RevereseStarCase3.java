package coding.info;

import java.util.ArrayList;
import java.util.List;
public class RevereseStarCase3 {
        public static void main(String[] args) {
            //String input = "leet**code";

            String input = "leet**govardhan";
            String result = removeClosestCharacters(input);
            System.out.println(result); // Output
        }

        public static String removeClosestCharacters(String s) {
            List<Character> resultList = new ArrayList<>();

            // Store positions of stars and process the string
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '*') {
                    // Remove the last added character if possible
                    if (!resultList.isEmpty()) {
                        resultList.remove(resultList.size() - 1);
                    }
                } else {
                    resultList.add(s.charAt(i));
                }
            }

            // Build the final string from the list
            StringBuilder result = new StringBuilder();
            for (char c : resultList) {
                result.append(c);
            }

            return result.toString();
        }
    }
