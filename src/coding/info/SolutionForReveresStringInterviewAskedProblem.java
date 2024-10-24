package coding.info;

import java.util.stream.Collectors;

public class SolutionForReveresStringInterviewAskedProblem {
        public String reverseString(String s) {

            if (s == null) {
                return null;
            }
            StringBuilder reversed = new StringBuilder();

            s.chars().mapToObj(c -> (char) c).collect(Collectors.toList())
                    .forEach(c -> reversed.insert(0, c));

            return reversed.toString();
        }

        public static void main(String[] args) {
            SolutionForReveresStringInterviewAskedProblem solution = new SolutionForReveresStringInterviewAskedProblem();
            String input = "abbbca ";

            System.out.println(solution.reverseString(input));
        }
    }
}
