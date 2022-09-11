package Array_Problems;

public class RichestPerson {
    static int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int wealth = 0, richer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (wealth > richer) {
                richer = wealth;
            }
            wealth = 0;
        }
        return richer;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {0, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }
}
