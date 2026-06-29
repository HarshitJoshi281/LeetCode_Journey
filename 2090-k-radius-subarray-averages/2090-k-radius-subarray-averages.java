class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] result = new int[nums.length];
        long[] sum = new long[nums.length];
        sum[0]=nums[0];
        for(int i =1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        long avj =0;
        for(int i =0;i<nums.length;i++){
            if(i-k<0||i+k>nums.length-1){
                result[i]=-1;
            }
            else{
                if(i-k==0){
                    avj= sum[i+k]/((2*k)+1);
                    result[i]= (int)avj;
                    avj=0;
                }
                else{
                    avj= (sum[i+k]-sum[i-k-1])/((2*k)+1);
                    result[i]= (int)avj;
                    avj=0;
                }
            }

        }
        return result;
    }
}