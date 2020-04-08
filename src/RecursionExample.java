public class RecursionExample {

    public static void main(String[] args) {
        System.out.println(fibonacciCalc(2));
    }

    private static int fibonacciCalc(int nthNumber) {
        if (nthNumber == 0) { return 0; }
        else if (nthNumber == 1) { return 1; }
        return fibonacciCalc(nthNumber-1) + fibonacciCalc(nthNumber-2);
    }
}
