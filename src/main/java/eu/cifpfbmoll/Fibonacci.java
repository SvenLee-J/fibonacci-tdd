package eu.cifpfbmoll;

public class Fibonacci {

    public int calculate(int n) {
        if (n < 0) {
        throw new IllegalArgumentException("Només s'accepten enters iguals o majors que zero");
    }
    
    if (n <= 1) {
        return n;
    }
            
        int previous = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }
}