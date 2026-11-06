package java_chuong_1.Java_c2;
import java.util.Scanner;

import java.math.BigInteger;
import java.util.Scanner;

public class j3033 {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger gcd = a.gcd(b);
        BigInteger lcm = a.divide(gcd).multiply(b);

        System.out.println(lcm);
    }

    public static void main(String[] args) {
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                solve();
            }
        }
    }
}