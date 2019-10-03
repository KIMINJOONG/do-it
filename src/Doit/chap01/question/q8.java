package Doit.chap01.question;

public class q8 {
    public static int getSum(int num) {
        int sum = 0;
        sum = num * (num + 1)/2;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(getSum(3));
        int sum = 0;
        for(int i = 1; i <= 3; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
