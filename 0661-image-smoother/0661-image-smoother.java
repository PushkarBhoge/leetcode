class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;

        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0, count = 0;

                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {
                        int r = i + x;
                        int c = j + y;

                        if (r >= 0 && r < m && c >= 0 && c < n) {
                            sum += img[r][c];
                            count++;
                        }
                    }
                }

                ans[i][j] = sum / count;
            }
        }

        return ans;
    }
}