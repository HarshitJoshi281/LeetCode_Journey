class Solution {
    public static int findDuplicate(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else if(i!=correct){
                return nums[i];
            }
            else
            i++;
        }
        return -1;
    }
}