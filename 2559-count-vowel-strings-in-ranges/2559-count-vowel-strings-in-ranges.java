class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] vowels = new int[words.length];
        int[] result =new int[queries.length];
        String word = words[0];
        if(startsAndEndsWithVowel(word)){
            vowels[0]=1;
        }
        for(int i =1;i<words.length;i++){
            word = words[i];
            if(startsAndEndsWithVowel(word)){
            vowels[i]=vowels[i-1]+1;
            }
            else{
                vowels[i]=vowels[i-1];
            }

        }
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            if(start!=0){
                result[i]=vowels[end]-vowels[start-1];
            }
            else{
                result[i]=vowels[end];
            }
        }
        return result;
    }
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }

    public boolean startsAndEndsWithVowel(String s) {
        return isVowel(s.charAt(0)) &&
               isVowel(s.charAt(s.length() - 1));
    }
}