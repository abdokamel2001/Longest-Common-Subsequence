public class LCS {

    public static void search(String S1, String S2) {
        search(S1.toCharArray(), S2.toCharArray());
    }

    public static void search(char[] X, char[] Y) {
        int m = X.length + 1;
        int n = Y.length + 1;
        int[][] C = new int[m][n]; //Counter
        int[][] D = new int[m][n]; //Direction
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (X[i - 1] == Y[j - 1]) {
                    C[i][j] = C[i - 1][j - 1] + 1;
                    D[i][j] = 1; //left-up
                } else if (C[i][j - 1] > C[i - 1][j]) {
                    C[i][j] = C[i][j - 1];
                    D[i][j] = 2; //left
                } else {
                    C[i][j] = C[i - 1][j];
                    D[i][j] = 3; //up
                }
            }
        }
        System.out.print("\nThe Longest Common Subsequence\n" +
                "is " + C[m - 1][n - 1] + " Characters Long\n" +
                "and it is \"");
        print(D, X, X.length, Y.length);
        System.out.println("\"");
    }

    private static void print(int[][] D, char[] X, int i, int j) {
        if (i < 1 || j < 1) return;
        if (D[i][j] == 1) {
            print(D, X, i - 1, j - 1);
            System.out.print(X[i - 1]);
        } else if (D[i][j] == 2) print(D, X, i, j - 1);
        else print(D, X, i - 1, j);
    }
}
