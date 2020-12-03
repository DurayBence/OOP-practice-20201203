public class Fibonacci {

    private int previousNumber = 0;
    private int currentNumber = 1;

    public int getNextNumber () {
        currentNumber += previousNumber;
        previousNumber = currentNumber - previousNumber;
        return currentNumber;
    }

    public void reset() {
        previousNumber = 0;
        currentNumber = 1;
        System.out.println("Fibonacci series has been reset...");
    }

    public boolean isFibonacciNumber (int input) {
        Fibonacci tempFib = new Fibonacci();
        int currentNumber = tempFib.getNextNumber();
        while (currentNumber <= input) {
            if (currentNumber == input) {
                //return true;
            }
            currentNumber = tempFib.getNextNumber();
        }
        return false;

        // alternative version according to formula
        /*
        // (if 5x² ± 4 is a perfect square number (e.g. 25, 36, 49,...), 'x' is a Fibonacci number)
         return (isPerfectSquare((int) (5 * Math.pow(input,2) + 4)))
             || (isPerfectSquare((int) (5 * Math.pow(input,2) - 4)));
        */
    }

    private static boolean isPerfectSquare (int input) {
        int root = (int) Math.sqrt(input);
        return (root*root == input);
    }

}