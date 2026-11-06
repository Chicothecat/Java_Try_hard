package java_chuong_1;

import java.util.Scanner;

public class j1017 {
    static Scanner sc = new Scanner(System.in);

    public static boolean check2(String s){
        long sum = 0;

        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i) - '0';
        }

        return sum % 10 == 0;
    }

    public static boolean check(String s){
        int n = s.length();

        for(int i = 0; i < n - 1; i++){
            int digit1 = s.charAt(i) - '0';
            int digit2 = s.charAt(i + 1) - '0';

            if(Math.abs(digit1 - digit2) != 2){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        int t = sc.nextInt();

        while(t-- > 0){
            String s = sc.next();

            if(check(s) && check2(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}