class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            boolean flag = false;
            for(int j=0;j<list.size();j++){
                if(nums[i]<=list.get(j)){
                    list.set(j,nums[i]);
                    flag=true;
                    break;
                }

            }
            if(!flag){
                list.add(nums[i]);
            }
        }
        return list.size();
    }
}