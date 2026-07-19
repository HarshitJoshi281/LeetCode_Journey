class Solution {
    public int[] closestPrimes(int left, int right) {
        int first =0;
        int second=0;
        int min =0;
        int[] result = new int[2];
        for(int i =left;i<=right;i++){
            int temp =0;
            
            if(isPrime(i)){
                if(first==0){
                    first=i;
                }
                else if(second==0){
                    second=i;
                     min =second-first;
                    result[0]=first;
                    result[1]=second;
                }
                else {
                     first =second;
                     second =i;
                     temp = second-first;
                     if(temp<min){
                        min =temp;
                        result[0]=first;
                        result[1]=second;
                     }

                }
            }

        }
        if(first==0||second==0) {
            result[0]=-1;
            result[1]=-1;
        }
        return result;
    }
    public boolean isPrime(int n) {
       
        if (n <= 1) {
            return false;
        }
        
     
        if (n == 2) {
            return true;
        }
        
       
        if (n % 2 == 0) {
            return false;
        }
        
        
        for (int i = 3; i<= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; 
            }
        }
        
        return true; 
    }
}