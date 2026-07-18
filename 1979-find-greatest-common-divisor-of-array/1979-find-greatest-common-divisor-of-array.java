class Solution {
    public int findGCD(int[] nums) {
        int num1 = nums[0];
        int num2 = nums[0];
        for(int i =1;i<nums.length;i++){
           if(nums[i]<num1){
            num1=nums[i];
           }
           else if(nums[i]>num2){
            num2=nums[i];
           }
        }
        return gcd(num1,num2);

    }
     private int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}