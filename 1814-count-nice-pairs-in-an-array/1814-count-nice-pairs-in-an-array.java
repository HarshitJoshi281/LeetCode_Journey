class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0]-reverce(nums[0]),1);
        int mod = 1000000007;

        int count =0;
        for (int i =1;i<nums.length;i++){
           
            int rev = reverce(nums[i]);
            int diff = nums[i]-reverce(nums[i]);
            if(map.containsKey(diff)){
                count =(count + map.get(diff))%mod;
            }
           
            map.put(diff, map.getOrDefault(diff, 0) + 1);

            
        }
        return count;
    }
    public int reverce(int n){
        int num = 0;
        while(n > 0) {
            int rem = n % 10;
            num = num*10 + rem;
            n /= 10;
        }
        return num;
    }
}