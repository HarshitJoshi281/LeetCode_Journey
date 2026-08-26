class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int minLength = Integer.MAX_VALUE;
        int i =0;
        int j =0;
        int count =0;
        while(j<s.length()){
            if(s.charAt(j)=='1'){
                count++;
                if(count==k){
                    while(s.charAt(i)!='1'){
                        i++;
                        
                    }
                    String temp = s.substring(i,j+1);
                    if(temp.length()==minLength){
                        if(temp.compareTo(ans)<0){
                            ans = temp;
                            minLength=temp.length();
                          
                        }
                    }
                    else if(temp.length()<minLength){
                        ans = temp;
                        minLength=temp.length();
                        
                    }
                    i++;
                    count--;
                }
            }
            j++;
        }
        return ans;
    }
}