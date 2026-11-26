class Solution {
    public double[] internalAngles(int[] sides) {
        long a = sides[0];
        long b = sides[1];
        long c = sides[2];

        if(a <= 0 || b <= 0 || c <= 0 || (a+b) <= c ||(b+c) <= a || (c+a) <= b) return new double[]{};

        double cosA = range((b*b + c*c - a*a)/(2.0*b*c));
        double cosB = range((a*a + c*c - b*b)/(2.0*a*c));
        double cosC = range((a*a + b*b - c*c)/(2.0*a*b));

        double angleradianA = Math.acos(cosA);
        double angleradianB = Math.acos(cosB);
        double angleradianC = Math.acos(cosC);

        double angledegreeA = Math.toDegrees(angleradianA);
        double angledegreeB = Math.toDegrees(angleradianB);
        double angledegreeC = Math.toDegrees(angleradianC);

        double[] ans = new double[]{angledegreeA,angledegreeB,angledegreeC};

        Arrays.sort(ans);

        return ans;
    }

    public double range(double num){
        return Math.max(-1.0 , Math.min(num , 1.0));
    }
}