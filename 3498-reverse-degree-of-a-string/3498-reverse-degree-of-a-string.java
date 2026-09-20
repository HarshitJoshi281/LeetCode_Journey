class Solution {
    public int reverseDegree(String s) {
       int sum = 0;
       
       for( int i = 0 ; i< s.length() ; i++){
         char ch = s.charAt(i);
         int ascii = (int) ch;
         
         int val = ascii - 97;
         
         int idxtemp = 26 - val;
         
         sum += idxtemp *(i+1);
       }
       return sum;
    }
}   