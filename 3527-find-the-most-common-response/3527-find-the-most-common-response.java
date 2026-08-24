class Solution {
    public String findCommonResponse(List<List<String>> responses) {

        HashMap<String, Integer> map = new HashMap<>();

        for (List<String> response : responses) {

            HashSet<String> set = new HashSet<>();

            for (String str : response) {

                if (set.add(str)) {
                    map.put(str, map.getOrDefault(str, 0) + 1);
                }
            }
        }

        String ans = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            String str = entry.getKey();
            int count = entry.getValue();

            if (count > max) {
                max = count;
                ans = str;
            }
            else if (count == max && str.compareTo(ans) < 0) {
                ans = str;
            }
        }

        return ans;
    }
}