class Solution {
    public String[] createGrid(int m, int n) {
        char[][] mat = new char[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = '#';
            }
        }
        Arrays.fill(mat[0] , '.');
        for(int i=0; i<m; i++){
            mat[i][n-1] = '.';
        }
        String[] s = new String[m];
        for (int i = 0; i < m; i++) {
            s[i] = new String(mat[i]);
        }
        return s;
    }
}