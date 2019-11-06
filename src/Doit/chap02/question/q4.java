package Doit.chap02.question;

import java.util.Scanner;

public class q4 {
    static void copy(int[] a, int[] b) {
        for(int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        System.out.print("배열의 길이를 입력해주세요.");
        Scanner stdIn = new Scanner(System.in);
        int[] b = new int[stdIn.nextInt()];

        for(int i = 0; i < b.length; i++) {
            System.out.print("배열의 " + i + "번째 요소의 값을 입력해주세요.");
            b[i] = stdIn.nextInt();
        }
        int[] a = new int[b.length];
        copy(a, b);

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

