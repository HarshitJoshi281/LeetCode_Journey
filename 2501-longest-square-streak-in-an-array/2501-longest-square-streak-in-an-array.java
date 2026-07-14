class Solution {
    public int longestSquareStreak(int[] nums) {
        int seq=1;
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i =0;i<nums.length;i++){
            int temp2=1;
            int temp =nums[i];
            while((long) temp * temp <= Integer.MAX_VALUE && set.contains((int) ((long) temp * temp))){
                temp2++;
                set.remove(temp);
                temp=temp*temp;
            }
            seq=Math.max(temp2,seq);
        }
        if(seq<2)return -1;
        return seq;
    }
}