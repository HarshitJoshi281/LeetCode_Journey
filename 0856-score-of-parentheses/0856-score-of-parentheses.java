class Solution {
    public int scoreOfParentheses(String s) {
        int open = 0;
        int power = 0;
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                open++; 
            } else {
                power = open-1;
                open--;
                System.out.println("power " + power);
                if(s.charAt(i-1)=='('){
                    ans = ans + (int)Math.pow(2,power);
                    System.out.println(ans);
                }
            }
        }
        return ans;
    }
}