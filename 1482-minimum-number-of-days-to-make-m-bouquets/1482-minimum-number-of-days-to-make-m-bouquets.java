class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length)return -1;
         int max = 0;
         int n = bloomDay.length;
         for(int i =0;i<n;i++){
            max=Math.max(bloomDay[i],max);
         }
         int result = -1;
         int left = 0;
         int right = max;
         while(left<=right){
            int mid = left +(right-left)/2;
            if(canBloom(bloomDay,k,m,mid)){
                result = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
         }
        return result;

    }
    boolean canBloom(int[] bloomDay,int k ,int m,int mid){
         int consecutive = 0;
         int bookey = 0;
         for(int i =0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                consecutive++;
                if(consecutive==k){
                    bookey++;
                    if(bookey==m)return true;
                    consecutive=0;
                }
            }
            else{
                consecutive=0;
            }
         }
        
         return false;
    }
}