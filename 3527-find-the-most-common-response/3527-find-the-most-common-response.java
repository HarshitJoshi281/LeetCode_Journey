class Solution { 
    public String findCommonResponse(List<List<String>> responses) { 
        List<List<String>> result = new ArrayList<>(); 
        
        for(int i = 0; i < responses.size(); i++) { 
            HashSet<String> set = new HashSet<>(); 
            List<String> temp = new ArrayList<>(); 
            
            for(int j = 0; j < responses.get(i).size(); j++) { 
                if(set.contains(responses.get(i).get(j))) { 
                    continue; 
                } 
                else { 
                    temp.add(responses.get(i).get(j)); 
                    set.add(responses.get(i).get(j)); 
                } 
            } 
            result.add(temp); 
        } 
        
        HashMap<String, Integer> map = new HashMap<>(); 
        
        for(int i = 0; i < result.size(); i++) { 
            for(int j = 0; j < result.get(i).size(); j++) { 
                map.put(
                    result.get(i).get(j),
                    map.getOrDefault(result.get(i).get(j), 0) + 1
                ); 
            } 
        } 
        
        String ans = new String(); 
        int max = 0; 
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) { 
            String temp = entry.getKey(); 
            
            if(entry.getValue() > max) { 
                ans = entry.getKey(); 
                max = entry.getValue();  
            } 
            
           else if(entry.getValue() == max) { 
                if(temp.compareTo(ans)<1){
                    ans= temp;
                } 
            } 
        } 
        
        return ans; 
    } 
}