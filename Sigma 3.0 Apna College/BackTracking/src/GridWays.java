public class GridWays {
    public static void main(String[] args) {
        int n,m;
        n=m=10;
        System.out.print(gridWays(0,0,n,m));
    }
    /**
     * Calculates number of ways to cross a grid in exponential time
     * complexity using backtracking.
     * @param x the column
     * @param y the row
     * @param n number of rows*in the grid
     * @param m number of column in grid
     * @return Total number of all possible ways if only moving right and
     * down
     */
    static int gridWays(int x, int y,int n,int m) {
        if (x == n - 1 || y == m - 1) return 1;
        if (x >= n && y >= m) return 0;
        int way_right = gridWays(x + 1, y, n, m);
        int way_left = gridWays(x, y + 1, n, m);
        return way_right + way_left;
    }
}

