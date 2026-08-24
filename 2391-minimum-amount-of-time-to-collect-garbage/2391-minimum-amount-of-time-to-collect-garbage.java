class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {

        int total = 0;

        for (String house : garbage) {
            total += house.length();
        }

       
        int lastM = -1;
        int lastP = -1;
        int lastG = -1;

        for (int i = 0; i < garbage.length; i++) {

            if (garbage[i].contains("M")) {
                lastM = i;
            }

            if (garbage[i].contains("P")) {
                lastP = i;
            }

            if (garbage[i].contains("G")) {
                lastG = i;
            }
        }

     
        for (int i = 0; i < lastM; i++) {
            total += travel[i];
        }

        for (int i = 0; i < lastP; i++) {
            total += travel[i];
        }

        for (int i = 0; i < lastG; i++) {
            total += travel[i];
        }

        return total;
    }
}