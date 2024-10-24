package coding.info.slidingLeet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

/*
Initialization: Two sets are used—seen to track sequences we’ve encountered and repeated to store sequences that repeat.
Loop through the string: The loop iterates through the string, extracting each 10-letter substring.
Check for repeats: If the substring is already in seen, it gets added to repeated. If not, it’s added to seen.
Return results: Finally, the repeated sequences are returned.
 */