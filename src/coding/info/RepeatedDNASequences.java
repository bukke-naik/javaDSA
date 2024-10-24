package coding.info;
import java.util.*;
public class RepeatedDNASequences {

        public List<String> findRepeatedDnaSequences(String s) {
            List<String> result = new ArrayList<>();
            Set<String> seen = new HashSet<>();
            Set<String> repeated = new HashSet<>();

            for (int i = 0; i <= s.length() - 10; i++) {
                String sequence = s.substring(i, i + 10);
                if (seen.contains(sequence)) {
                    repeated.add(sequence);
                } else {
                    seen.add(sequence);
                }
            }

            result.addAll(repeated);
            return result;
        }

        public static void main(String[] args) {
            RepeatedDNASequences rds = new RepeatedDNASequences();
            String dna = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
            List<String> repeatedSequences = rds.findRepeatedDnaSequences(dna);
            System.out.println(repeatedSequences);
        }
    }

