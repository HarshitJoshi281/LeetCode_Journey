class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return help(word1,word2,0,0,dp);
    }
    public int help(String s1,String s2,int i ,int j,int[][] dp){
        if(i==s1.length()){
            return s2.length()-j;
        }
        if(j==s2.length()){
            return s1.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] = help(s1,s2,i+1,j+1,dp);
        }
        int insert = 1+ help(s1,s2,i,j+1,dp);
        int del = 1+help(s1,s2,i+1,j,dp);
        int rep = 1+help(s1,s2,i+1,j+1,dp);
        return dp[i][j]=Math.min(insert,Math.min(del,rep));
    }
}