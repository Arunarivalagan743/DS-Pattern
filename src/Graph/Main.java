package Graph;

public class Main {

    static int n = 5;
    static int m = 5;

    static char[][] grid = {
            {'#', '#', '#', '#', '#'},
            {'#', '.', '.', '#', '#'},
            {'#', '.', '#', '.', '#'},
            {'#', '.', '.', '#', '#'},
            {'#', '#', '#', '#', '#'}
    };

    static boolean[][] vis = new boolean[n][m];

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void dfs(int x, int y) {
        vis[x][y] = true;

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (!vis[nx][ny] && grid[nx][ny] == '.') {
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) {

        int rooms = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '.' && !vis[i][j]) {
                    dfs(i, j);
                    rooms++;
                }
            }
        }

        System.out.println("Rooms = " + rooms);
    }
}