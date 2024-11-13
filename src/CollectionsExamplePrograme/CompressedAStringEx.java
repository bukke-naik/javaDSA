package CollectionsExamplePrograme;

public class CompressedAStringEx {

    public static void main(String[] args) {

        String s ="aaassbsbbbbbskkkkklllllooo";

        StringBuilder sb = new StringBuilder();

        int cout =0;
        char last =s.charAt(0);

        for(char c :s.toCharArray()){

            if(c==last){
                cout++;

            }else {

                sb.append(last).append(cout);
                cout =0;
                last=c;
            }
        }
        if(cout !=0){
            sb.append(last).append(cout);
        }
        System.out.println(sb);


    }
}
