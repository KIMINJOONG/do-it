package Doit.chap01.question;

public class q9 {
    static int sumOf(int a, int b) {
        int sum = 0;
        for(int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print(sumOf(4,6));
    }
}
