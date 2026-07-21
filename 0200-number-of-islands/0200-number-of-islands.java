class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==1&&grid[0].length==1){
            if(grid[0][0]=='1')return 1;
            else return 0;
        }
        int[][] directions = {
            {-1,0},{1,0},
            {0,-1},{0,1}
        };
        int count =0;

        Queue<int[]> queue = new LinkedList<>();
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='0')continue;
                queue.add(new int[] {i,j});
                grid[i][j]='0';
                while(!queue.isEmpty()){
                    int[] cell = queue.remove();
                    int row=cell[0],col=cell[1];
                    for(int[] direction:directions){
                        int newRow = row+direction[0];
                        int newCol = col+direction[1];
                        if(newRow>=0&&newRow<grid.length&&newCol>=0&&newCol<grid[0].length&&grid[newRow][newCol]=='1'){
                            queue.add(new int[]{newRow,newCol});
                            grid[newRow][newCol]='0';
                        }
                    }
                }
                count++;
            }
        }
        return count;

    }
}