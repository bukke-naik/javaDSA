package coingTest;

import java.util.Arrays;

public class CompareTwoStringEx1 {

    public static void main(String[] args) {

        String s1 = "ab", s2 = "eidbaooo";
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);

        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch2);
        System.out
                .println("Both strings contains same chars :" + Arrays.equals(ch1, ch2));

        String s11 = new String(ch1);
        String s22 = new String(ch2);
        System.out.println("Using String equals method,Both strings contains same chars : :" + s11.equalsIgnoreCase(s22));
    }
}