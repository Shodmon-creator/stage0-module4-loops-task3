package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int numberOne=0;
        int numberTwo=1;
        int fibonacci = 0;
        for (int i = 1; i<lastFibonacci; i++) {
            if (fibonacci==1)
                System.out.println(numberOne);
            System.out.println(fibonacci);
            fibonacci=numberOne+numberTwo;
            numberOne = numberTwo;
            numberTwo=fibonacci;

        }
    }
}
