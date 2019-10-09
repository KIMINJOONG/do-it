package Doit.chap02.question;

import java.util.Random;
import java.util.Scanner;

public class q1 {
    static int getMax(int[] height) {
        int max = height[0];
        for(int i = 1; i < height.length; i++) {
            if(height[i] > max)
                max = height[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num = random.nextInt(10);
        System.out.println("사람 수 : " + num);
        if(num > 0) {
            int[] height = new int[num];
            for(int i = 0; i < num; i++) {
                height[i] = 100 + random.nextInt(90);
                System.out.println("height[" + i + "] : " + height[i] );
            }
            System.out.println("최댓값은 : " + getMax(height));
        } else {
            System.out.println("사람수가 0보다 작습니다.");
        }
    }
}
