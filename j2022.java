package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j2022 {
    static Scanner sc = new Scanner(System.in);
    static int[] a;
    static int n;
    static boolean[] vs;

    static void in(){
        for(int i=1; i<=n; i++){
            System.out.printf("%d", a[i]);
        }
        System.out.println();
    }

    static void back_track(int i){
        for(int j=1; j<=n; j++){
            // Sửa lại điều kiện kiểm tra liền kề và cú pháp Math.abs
            if(!vs[j]){
                if(i > 1 && Math.abs(j - a[i-1]) == 1) continue;
                
                a[i] = j;
                vs[j] = true;
                if(i == n){
                    in();
                } else {
                    back_track(i + 1);
                }
                vs[j] = false;
            }
        }
    }

    public static void main(String[] args){
        n = sc.nextInt();
        a = new int[n + 1];
        vs = new boolean[n + 1];
        back_track(1);
    }
}