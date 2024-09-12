public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDenominator(25, 15));
        System.out.println(getGreatestCommonDenominator(12, 30));
        System.out.println(getGreatestCommonDenominator(9, 18));
        System.out.println(getGreatestCommonDenominator(81, 153));

    }

    private static int getGreatestCommonDenominator(int first, int second) {
        if (first < 0) {
            return -1;
        }
        if (second < 0) {
            return -1;
        }

        int gcd = 1;

        int smallest = 0;

        if (first <= second) {
            smallest = first;
        } else {
            smallest = second;
        }

        for (int i = 1; i <= smallest; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;

            }


        }



        return gcd;
    }

}