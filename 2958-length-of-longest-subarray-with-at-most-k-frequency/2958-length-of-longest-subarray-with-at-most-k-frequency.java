class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 1;
        int result = 0;
        int count = 1;
        map.put(nums[0], 1);
        while (j != nums.length) {
            int temp = nums[j];
            if (map.getOrDefault(temp,0) != 0) {
                if (map.get(temp) <k) {
                    count++;
                    j++;
                   result =  Math.max(count,result);
                   map.put(temp,map.getOrDefault(temp,0)+1);
                } else {
                    int currentFreq = map.getOrDefault(nums[i],0);
                    if (currentFreq > 1) {
                        map.put(nums[i], currentFreq - 1);
                    } else {
                        map.remove(nums[i]); 
                    }
                    i++;
                    count--;
                }
            }
            else{
                map.put(temp,map.getOrDefault(temp,0)+1);
                count++;
                j++;
                result=Math.max(result,count);
            }

            
        }
        
        return Math.max(result,count);
    }
}