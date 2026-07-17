class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int first =0;
        int last =0;
        boolean flag = false;
        int[] copy = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            copy[i]=nums[i];
        }
        Arrays.sort(copy);
        for(int i =0;i<nums.length;i++){
            if(copy[i]!=nums[i]){
                if(flag==false){
                    if(i==0){
                        first =0;
                        last=1;
                    }
                    else {
                        first=i;
                        
                    }
                    flag =true;
                }
                else{
                    last =i;
                }
            }
        }
        if(first==0&&last==0)return 0;
        return last-first+1;

        

    }
}