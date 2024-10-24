package coingTest;

public class Example2Code {
    public static void main(String[] args) {

        String str1= "abc";
        String str12="cba";

        char [] arr1= str1.toCharArray();
        char  [] arr2 =str12.toCharArray();

        String sorted_str1 = new String(arr1);
        String sorted_str2 = new String(arr2);

        if (sorted_str1.equals(sorted_str2)){
            System.out.println("both  vale are :::: "+true);
        }else {

            System.out.println("both are "+false);
        }
    }

}
