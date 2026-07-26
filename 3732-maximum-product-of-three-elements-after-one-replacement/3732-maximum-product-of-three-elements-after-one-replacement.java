class Solution {
    public long maxProduct(int[] nums) {

        
        for(int i =0;i<nums.length;i++){
            nums[i]= Math.abs(nums[i]);
        }
        long f=0;
        long s=0;
        if(nums[0]>nums[1]){
            f=nums[0];
            s=nums[1];
        }
        else{
            f=nums[1];
            s=nums[0];
        }
        for(int i= 2;i<nums.length;i++){
            if(nums[i]>f){
                s=f;
                f=nums[i];
            }
            else if(nums[i]>s){
                s=nums[i];
            }
        }
       
        
        long result = f*s *100000;
        return result;
    }
}