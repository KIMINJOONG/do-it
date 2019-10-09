package Doit.chap02.question;

public class q2 {
    static void swap(int a[], int idx1, int idx2) {
        System.out.println("a[" + idx1 + "] 와" + "a[" + idx2 + "]를 교환합니다." );
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for(int i = 0; i < a.length /2; i++){
            swap(a, i,a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 10, 73, 2, -5, 42};

        for(int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] : " + a[i]);
        }

        reverse(a);

        for(int i = 0; i < a.length; i++) {

            System.out.println("a[" + i + "] : " + a[i]);
        }
        System.out.println("역순정렬을 마쳤습니다.");
    }
}
