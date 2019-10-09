package Doit.chap02;

import java.util.Scanner;

public class MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("사람 수 : " );
        int num = stdIn.nextInt();

        int[] height = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("height [" + i + "] : ");
            height[i] = stdIn.nextInt();
        }

        System.out.print("제일 키가 큰 값은 " + maxOf(height) + "입니다.");

    }
}
