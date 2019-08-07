package module2Algorithmization.decompositionUsingMethods;

public class Task7 {

    public static void main(String[] args) {
        System.out.println(productOddFractalFromStartToEnd(1,5));
    }

    private static int factorial(int a) {
        int res;
        if (a == 1) {
            return 1;
        }
        res = factorial(a - 1) * a;
        return res;

    }

    private static long productOddFractalFromStartToEnd(int start, int end) {
        long product = 1;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                product *= factorial(i);
                System.out.println(i);
            }
        }

        return product;
    }
}
