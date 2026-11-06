package java_chuong_1.Java_c2;

import java.util.Scanner;

public class j2011_2 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] a;

    // Hàm nhập dữ liệu
    static void nhap() {
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
    }

    // Hàm in trạng thái dãy số
    static void in() {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    // Hàm đổi chỗ hai phần tử ở chỉ số i và j
    static void swap(int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    // Thuật toán sắp xếp nổi bọt (Bubble Sort)
    static void solve() {
        n = sc.nextInt();
        a = new int[n + 1];
        nhap();

        int step = 1;
        for (int i = 1; i <= n - 1; i++) {
            boolean check_swap = false; // Đánh dấu xem vòng này có đổi chỗ không

            // Đẩy phần tử lớn nhất còn lại về cuối dãy
            for (int j = 1; j <= n - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1);
                    check_swap = true; // Đã phát sinh đổi chỗ
                }
            }

            // Nếu không có phép đổi chỗ nào -> Dãy đã được sắp xếp hoàn toàn -> Dừng
            if (!check_swap) {
                break;
            }

            System.out.printf("Buoc %d: ", step++);
            in();
        }
    }

    public static void main(String[] args) {
        solve();
    }
}