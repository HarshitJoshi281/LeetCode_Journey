class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder st = new StringBuilder();
        for(int i =0;i<nums.length;i++){
            st.append(nums[i]);
        }
        //System.out.println(st);
        int[] ans = new int[st.length()];
        for(int i =0;i<ans.length;i++){
            ans[i]= st.charAt(i)-'0';
        }
        return ans;
    }
}