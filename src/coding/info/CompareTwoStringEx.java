package coding.info;

import java.util.Arrays;

public class CompareTwoStringEx {
    public static void main(String[] args) {

    }

        public boolean checkInclusion(String s1, String s2) {
            if(s1.length()>s2.length() ||s2.length()==0){
                return false;
            }
            if(s1.length()==0){
                return true;
            }
            int a[]=new int[26];
            int b[]=new int[26];
            for(int i=0;i<s1.length();i++){
                a[s1.charAt(i)-'a']++;
                b[s2.charAt(i)-'a']++;
            }
            for(int i=s1.length();i<s2.length();i++){
                if(Arrays.equals(a,b)){
                    return true;
                }
                else{
                    b[s2.charAt(i-s1.length())-'a']--;
                    b[s2.charAt(i)-'a']++;
                }}
            if(Arrays.equals(a,b))return true;
            else return false;

        }
    }

