
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];

        if (oldColor == color) return image;

        int m = image.length, n = image[0].length;

        int[][] stack = new int[m * n][2];
        int top = 0;

        stack[top++] = new int[]{sr, sc};
        image[sr][sc] = color;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (top > 0) {
            int[] cell = stack[--top];
            int r = cell[0], c = cell[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nc >= 0 && nr < m && nc < n
                    && image[nr][nc] == oldColor) {

                    image[nr][nc] = color;
                    stack[top++] = new int[]{nr, nc};
                }
            }
        }

        return image;
    }
}
