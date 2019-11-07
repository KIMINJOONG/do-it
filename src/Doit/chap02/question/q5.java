package Doit.chap02.question;

import java.util.Scanner;

public class q5 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    static void rcopy(int[] a, int[] b) {
        for(int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
        for(int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("배열의 요솟수를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] b = new int[count];
        for(int i = 0; i < count; i ++) {
            System.out.print("b의 " + i + "번째 요솟값을 입력해주세요.");
            b[i] = scanner.nextInt();
        }
        int[] a = new int[b.length];
        rcopy(a, b);
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
