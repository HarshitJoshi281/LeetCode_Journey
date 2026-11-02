class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
       int mid = nums[nums.length/2];
       int count =0;
       for(int i =0;i<nums.length;i++){
        int temp = nums[i]-mid;
        if(temp<0)temp*=-1;
        count+=temp;
       } 
       return count;
    }
}