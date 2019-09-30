package Doit.chap01.question;

public class q1 {
    static int max4(int a, int b, int c, int d) {
        int max = a;

        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        if(d > max) {
            max = d;
        }
        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if(min > b) {
            min = b;
        }
        if(min > c) {
            min = c;
        }
        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(min > b) {
            min = b;
        }
        if(min > c) {
            min = c;
        }
        if(min > d) {
            min = d;
        }
        return min;
    }

    public static void main(String[] args) {
        int max = max4(4, 6, 3, 1);
        System.out.println(max);

        int min = min3(7, 2, 5);
        System.out.println("q2 세값의 최솟값을 구하는 min3 : " + min);

        int min2 = min4(3, 6, 5, 2);
        System.out.println("q3 네값의 최솟값을 구하는 min4 : " + min2);
    }
}
