class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        int strength1=0;
        int strength2=0;
        for(int i =0;i<s2.length();i++){
            strength1+=s1.charAt(i)-'a';
            strength2+=s2.charAt(i)-'a';
        }
        
        int[] freq = new int[26];
        if(strength1>strength2){
           for(int i =0;i<s2.length();i++){
            char ch = s2.charAt(i);
            freq[ch-'a']++;

        }
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            boolean flag = false;
            for(int j =ch-'a';j>=0;j--){
                if(freq[j]>0){
                    freq[j]--;
                    flag=true;
                    break;
                }
            }
            if(!flag){
                return false;
            }
        }
        }
        else{
            for(int i =0;i<s2.length();i++){
            char ch = s1.charAt(i);
            freq[ch-'a']++;

        }
        for(int i = 0;i<s1.length();i++){
            char ch = s2.charAt(i);
            boolean flag = false;
            for(int j =ch-'a';j>=0;j--){
                if(freq[j]>0){
                    freq[j]--;
                    flag=true;
                    break;
                }
            }
            if(!flag){
                return false;
            }
        } 
        }
        
        return true;
    }
}