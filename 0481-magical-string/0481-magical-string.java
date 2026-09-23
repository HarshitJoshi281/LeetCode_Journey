class Solution {
    public int magicalString(int n) {
        StringBuilder sb = new StringBuilder("122");

        int count = 0;
        int i = sb.length() - 1;
        int j = 1;

        while (sb.length() <n) {
            if (sb.charAt(i) == '2') {
                if (j == 1) {
                    sb.append('1');
                    sb.append('1');
                    j = 2;
                } else {
                    sb.append('2');
                    sb.append('2');
                    j = 1;
                }
            } else {
                if (j == 1) {
                    sb.append('1');
                    j = 2;
                } else {
                    sb.append('2');
                    j = 1;
                }
            }

            i++;
        }


        for (int l = 0; l < n; l++) {
            if (sb.charAt(l) == '1') {
                count++;
            }
        }

        return count;
    }
}