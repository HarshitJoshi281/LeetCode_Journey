class Solution {
    public int scoreOfParentheses(String s) {
       
        Stack<Integer> stack= new Stack<>();
        stack.push(0);
        for(char ch :s.toCharArray()){
            if(ch=='('){
                stack.push(0);
            }
            else{
                if(!stack.isEmpty()){
                    int A = Math.max(2*stack.pop(),1);
                    int B = A+stack.pop();
                    stack.push(B);
                }
            }
        }
        return stack.pop();
    }
}