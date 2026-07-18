class Solution {
    public int countServers(int[][] grid) {
        int count =0;
        for(int i =0;i<grid.length;i++){
            int val =0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    val++;
                
                    }
                
            }
            if(val>1){
                count+=val;
                for(int k=0;k<grid[0].length;k++){
                    if(grid[i][k]==1)
                    grid[i][k]=2;
                }
            }
            val=0;
        }
        for(int i =0;i<grid[0].length;i++){
        int val=0;
        int val2 =0;
        for(int j=0;j<grid.length;j++){
            if(grid[j][i]>=1)val++;
            if(grid[j][i]==2)val2++;
        }
        if(val>1)count+=val-val2;
        val=0;
        val2=0;

    }
       return count;
    }
    

   

    
}