package CollectionsExamplePrograme;

public class SortingTwoArrayEx {
    public static void main(String[] args) {
        String[]  names = {"govardhan","bhaskar","bhavana","nagamuni","dharvik","hithvik"};
        int[] score={40,80,30,80,100,100};

        Pair[] pairs = new Pair[names.length];

        for(int i=0;i< names.length;i++){

            pairs[i] =new Pair(names[i],score[i]);
        }




    }

 public static  class Pair{


     String names;
     int score;

     public Pair(String names, int score) {
         this.names = names;
         this.score = score;
     }

 }
}

