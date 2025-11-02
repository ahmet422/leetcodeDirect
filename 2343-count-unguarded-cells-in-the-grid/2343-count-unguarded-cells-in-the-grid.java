class Solution {
        public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        int cells=m*n-(guards.length+walls.length);

        for(int[] arr : guards)
            grid[arr[0]][arr[1]] = -1;

        for(int[] arr : walls)
            grid[arr[0]][arr[1]] = 1;

        for(int[] guard : guards){
            // go in 4 directions up to wall or limit
            int r = guard[0], c = guard[1];
            // up
            cells = scanUp(r, grid, c, cells);
            // down
            cells = scanDown(r, grid, c, cells);
            // right
            cells = scanRight(c, grid, r, cells);
            // left
            cells = scanLeft(c, grid, r, cells);
        }
        return cells;
    }

    private int scanLeft(int c, int[][] grid, int r, int cells) {
        for(int i = c -1; i >= 0; i--){
            if(grid[r][i] == 0) {
                grid[r][i] = 5;
                cells--;
            }else if(grid[r][i]==1 || grid[r][i]==-1) break;
        }
        return cells;
    }

    private int scanRight(int c, int[][] grid, int r, int cells) {
        for(int i = c +1; i < grid[0].length; i++){
            if(grid[r][i] == 0) {
                grid[r][i] = 5;
                cells--;
            }else if(grid[r][i]==1 || grid[r][i]==-1) break;
        }
        return cells;
    }

    private int scanDown(int r, int[][] grid, int c, int cells) {
        for(int i = r +1; i < grid.length; i++){
            if(grid[i][c] == 0) {
                grid[i][c] = 5;
                cells--;
            }else if(grid[i][c]==1 || grid[i][c]==-1) break;
        }
        return cells;
    }

    private int scanUp(int r, int[][] grid, int c, int cells) {
        for(int i = r -1; i >=0; i--){
            if(grid[i][c] == 0) {
                grid[i][c] = 5;
                cells--;
            }else if(grid[i][c]==1 || grid[i][c]==-1) break;
        }
        return cells;
    }
}