package coding.info;

public class FindPresidentEx {

        public static int findPresident(int n, int k) {
            // Create an array to represent students
            boolean[] students = new boolean[n];
            for (int i = 0; i < n; i++) {
                students[i] = true; // All students are initially present
            }

            int currentIndex = 0; // Start at student 1 (index 0)
            int remainingStudents = n;

            while (remainingStudents > 1) {
                // Find the index to remove
                currentIndex = (currentIndex + k - 1) % remainingStudents; // k-1 because we count from currentIndex
                // Remove the student
                students[currentIndex] = false;
                remainingStudents--;
                // Move to the next student (circular)
                while (!students[currentIndex]) {
                    currentIndex = (currentIndex + 1) % n;
                }
            }

            // Find the last remaining student
            for (int i = 0; i < n; i++) {
                if (students[i]) {
                    return i + 1; // Convert index to student number (1-based)
                }
            }
            return -1; // This line should never be reached
        }
        public static void main(String[] args) {
            int n = 4; // Number of students
            int k = 2; // Length of the song
            System.out.println("Elected President: " + findPresident(n, k));
        }
    }

