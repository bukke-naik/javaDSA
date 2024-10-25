package coding.info;

public class PalendromeisPalendrome {

        public boolean isPalindrome(String abc){
            if(abc != null && abc.length() > 0){
                char[] arr = abc.toCharArray();
                for (int i = 0; i < arr.length/2; i++) {
                    if(arr[i] != arr[arr.length - 1 - i]){
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        public static void main(String[] args) {
            PalendromeisPalendrome solution = new PalendromeisPalendrome();

            String input1 = "racecar";
            String input2 = "hello";
            String input3 = "A man a plan a canal Panama";

            System.out.println( solution.isPalindrome(input1));
            System.out.println(solution.isPalindrome(input2));
            System.out.println( solution.isPalindrome(input3));
        }
    }
