package Doit.chap02.question;

import java.util.Scanner;

public class q3 {
    static int sumOf(int[] a) {
        int i;
        int sum = 0;
        for(i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("요솟수는 ");
        int num = stdIn.nextInt();

        int[] a = new int [num];
        int i;
        for(i = 0; i < a.length; i++) {
            System.out.print("a[ " + i + " ] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.println("전 요소의 합계는 " + sumOf(a) + "입니다.");
    }
}
