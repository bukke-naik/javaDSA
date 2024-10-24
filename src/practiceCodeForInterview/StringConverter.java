package practiceCodeForInterview;

public class StringConverter {
    public static void main(String[] args) {
        String input = "aaaacccbbcscncnncnmamamnnna";
        String output = convertStringEx(input);
        System.out.print("conveted String::"+output);
    }

    public static String convertStringEx(String input) {

        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input.length(); i++) {

            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {

                count++;

            } else {

                result.append(input.charAt(i)).append(count);
                count = 1;

            }

        }

        return result.toString();
    }
}

