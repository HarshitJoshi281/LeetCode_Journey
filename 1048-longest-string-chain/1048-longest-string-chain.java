class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(s1, s2) -> Integer.compare(s1.length(), s2.length()));
        int[][] dp = new int[words.length][words.length+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return help(words,0,-1,dp);
    }
    public int help(String[] words,int idx,int previdx,int[][] dp){
          if(idx>=words.length) return 0;
          if(dp[idx][previdx+1]!=-1){
            return dp[idx][previdx+1];
          }
          int take =0;

          if(previdx==-1||predecessor(words[previdx],words[idx])){
            take = 1+help(words,idx+1,idx,dp);
          }
          int skip = help(words,idx+1,previdx,dp);
          return dp[idx][previdx+1]= Math.max(skip,take);
    }
    public boolean predecessor(String a, String b) {
    if (b.length() - a.length() != 1) return false;

    int i = 0;  
    int j = 0;

    while (i < a.length() && j < b.length()) {
        if (a.charAt(i) == b.charAt(j)) {
            i++;
            j++;
        } else {
            j++; 
        }
    }

    return i == a.length();
}
}