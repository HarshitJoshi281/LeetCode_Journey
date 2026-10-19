class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int[] result = new int[2];
        int i =0;
        int j =0;
        while(i!=grid.length&&j!=grid[0].length&&i>=0&&j>=0){
            if(grid[i][j]=='X')return result;
            if(grid[i][j]=='R'){
                result[0]=i;
                result[1]=j;
                grid[i][j]='X';
                j=j+1;

            }
            else if(grid[i][j]=='U'){
                 result[0]=i;
                result[1]=j;
                grid[i][j]='X';
                i=i-1;
            }
            else if(grid[i][j]=='L'){
                 result[0]=i;
                result[1]=j;
                grid[i][j]='X';
               j=j-1;
            }
            else if(grid[i][j]=='D'){
                 result[0]=i;
                result[1]=j;
                grid[i][j]='X';
               i=i+1;
            }
            
        }
        return result;
    }
}