package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String number=""+t;
        for (int i = 0; i <number.length(); i++) {
            sum+=Math.abs(t)%10;
            t/=10;
        }
        System.out.println(sum);
    }
}
