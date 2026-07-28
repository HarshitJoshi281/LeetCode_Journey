class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()<=1)return s;
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
           //int temp =c;
           map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder(s);
        int i =0;
        int j = s.length()-1;
        char c ='a';
        while(i<j){
            int currFreq= map.getOrDefault(c, 0);
            if(currFreq>2){
                sb.setCharAt(i,c);
                sb.setCharAt(j,c);
                i++;
                j--;
                map.put(c, currFreq - 2);

            }
            else if(currFreq==2){
                sb.setCharAt(i,c);
                sb.setCharAt(j,c);
                i++;
                j--;
                map.remove(c);
                c++;
            }
            else if(currFreq==1){
                sb.setCharAt(s.length()/2,c);
                map.remove(c);
                c++;
            }
            else{
                c++;
            }

        }
        return sb.toString();
    }
}