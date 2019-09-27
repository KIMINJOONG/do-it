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

    public static void main(String[] args) {
        int max = max4(4, 6, 3, 1);
        System.out.println(max);
    }
}
