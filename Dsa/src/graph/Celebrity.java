package graph;

public class Celebrity {
    // Helper function to know if person a knows person b
    boolean knows(int[][] matrix, int a, int b) {
        return matrix[a][b] == 1;
    }

    // Function to find the celebrity
    int findCelebrity(int n, int[][] matrix) {
        int celebrityCandidate = 0;

        // Find the celebrity candidate
        for (int i = 1; i < n; i++) {
            if (knows(matrix, celebrityCandidate, i)) {
                celebrityCandidate = i;
            }
        }

        // Verify the candidate
        for (int i = 0; i < n; i++) {
            if (i != celebrityCandidate && (knows(matrix, celebrityCandidate, i) || !knows(matrix, i, celebrityCandidate))) {
                return -1;
            }
        }

        return celebrityCandidate;
    }

    public static void main(String[] args) {
        Celebrity celebrity = new Celebrity();

        int n = 5;
        int[][] matrix = {
            {0, 1, 0, 0,1},
            {1, 0, 0, 0,1},
            {0, 1, 0, 1,1},
            {0, 0, 0, 0,0},
            {1, 0, 0, 0,1}
        };

        int result = celebrity.findCelebrity(n, matrix);
        if (result == -1) {
            System.out.println("No celebrity found.");
        } else {
            System.out.println("Celebrity is person " + result);
        }
    }
}
