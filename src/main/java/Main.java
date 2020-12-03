public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Lamp class function calls
        /*
        Lamp lamp1 = new Lamp();
        System.out.println(lamp1.isTurnedOn());
        lamp1.turnOn();
        System.out.println(lamp1.isTurnedOn());
        lamp1.turnOff();
        System.out.println(lamp1.isTurnedOn());
        */

        //Fibonacci class function calls
        /*
        Fibonacci f1 = new Fibonacci();

        for (int i = 0; i < 20; i++) {
            System.out.println(f1.getNextNumber());
        }

        f1.reset();
        System.out.println(f1.getNextNumber()); //1

        System.out.println(f1.isFibonacciNumber(5));
        System.out.println(f1.isFibonacciNumber(6));
        System.out.println(f1.isFibonacciNumber(7));
        System.out.println(f1.isFibonacciNumber(8));
        */

        //Stopwatch class

        Stopwatch s = new Stopwatch();

        System.out.println("Stopwatch is currently running: " + s.isStarted());
        s.start();
        Thread.sleep(1500);
        System.out.println(s.getCurrentTime() + " ms has passed since the start.");
        Thread.sleep(500);
        System.out.println("Stopwatch is currently running: " + s.isStarted());
        s.stop();
        System.out.println("Stopwatch is currently running: " + s.isStarted());
        System.out.println(s.getCurrentTime() + " ms has passed since the start.");
        s.stop();

    }

}
