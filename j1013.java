package java_chuong_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j1013 {
    static final int MAX = 2000000;
    static int[] minPrime = new int[MAX + 1];

    // Sàng tìm ước số nguyên tố nhỏ nhất
    public static void sang() {
        for (int i = 2; i * i <= MAX; i++) {
            if (minPrime[i] == 0) {
                for (int j = i * i; j <= MAX; j += i) {
                    if (minPrime[j] == 0) {
                        minPrime[j] = i;
                    }
                }
            }
        }
        for (int i = 2; i <= MAX; i++) {
            if (minPrime[i] == 0) {
                minPrime[i] = i;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        sang(); // Khởi tạo mảng sàng trước

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        
        int n = Integer.parseInt(line.trim());
        long tong = 0; // Khai báo ngoài vòng lặp

        while (n > 0) {
            String l = br.readLine();
            if (l == null) break;
            StringTokenizer st = new StringTokenizer(l);
            while (st.hasMoreTokens()) {
                int x = Integer.parseInt(st.nextToken());
                while (x > 1) {
                    tong += minPrime[x];
                    x /= minPrime[x];
                }
                n--;
            }
        }

        System.out.println(tong);
    }
}