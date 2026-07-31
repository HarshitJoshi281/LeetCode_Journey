class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> map = new HashMap<>();
        int count =0;
        int wor =1;
        
        for(char c:word.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        
        // FIX: Sort the list by VALUE in descending order (highest frequency first)
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        
        // Your exact looping logic now works perfectly because entryList is sorted right!
        for (Map.Entry<Character, Integer> entry : entryList) {
           if (wor > 0 && wor <= 8) {
               count = count + (entry.getValue());
               wor++;
           }
           else if (wor > 8 && wor <= 16) {
               count = count + 2 * (entry.getValue());
               wor++;
           }
           else if (wor > 16 && wor <= 24) {
                count = count + 3 * (entry.getValue());
                wor++;
           }
           else {
                count = count + 4 * (entry.getValue());
                wor++;
                }
        }
        return count;
        
    }
}