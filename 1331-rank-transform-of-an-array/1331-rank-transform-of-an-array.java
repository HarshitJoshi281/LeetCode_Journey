class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0)return arr;
        int[] result = new int[arr.length];
        int[] copy = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        Arrays.sort(copy);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank =1;
        for(int i =1;i<arr.length;i++){
           if(copy[i]!=copy[i-1]){
            map.put(copy[i-1],rank);
            rank++;
           }
           else{
            map.put(copy[i-1],rank);
           }
        }
        map.put(copy[copy.length-1],rank);
        for(int i =0;i<arr.length;i++){
            result[i]=map.get(arr[i]);
        }
        return result;
    }
}