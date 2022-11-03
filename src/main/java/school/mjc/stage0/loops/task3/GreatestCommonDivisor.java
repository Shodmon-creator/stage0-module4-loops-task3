package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int i = 0;


        if (first == 0 || second == 0) {
            System.out.println(Math.max(first, second));
        } else if (first == second) {
            System.out.println(first);
        } else if (first > second) {
            i = second;
        } else {
            i = first;
        }
        for (i = i; i > 1; i--) {
            if (first % i == 0 && second % i == 0) {
                System.out.println(i);
            }
        }
    }
}
