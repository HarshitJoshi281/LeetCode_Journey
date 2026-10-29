


class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] result = new int[2];

        ArrayList<ArrayList<Double>> list = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                ArrayList<Double> row = new ArrayList<>();

                row.add((double) arr[i] / arr[j]);
                row.add((double) arr[i]);
                row.add((double) arr[j]);

                list.add(row);
            }
        }

        list.sort((row1, row2) ->
            Double.compare(row1.get(0), row2.get(0))
        );

        ArrayList<Double> row = list.get(k - 1);

        result[0] = row.get(1).intValue();
        result[1] = row.get(2).intValue();

        return result;
    }
}
