package OOP;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class j4001 {
    static Scanner sc = new Scanner(System.in);
    static Integer[] a;
    static ArrayList<String> results;

    static boolean snt(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    static void back_track(int tong, int k, ArrayList<Integer> current) {
        if (k > a.length - 1) {
            if (snt(tong)) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < current.size(); i++) {
                    sb.append(current.get(i));
                    if (i < current.size() - 1) sb.append(" ");
                }
                results.add(sb.toString());
            }
            return;
        }
        
        // Nhánh chọn phần tử a[k]
        current.add(a[k]);
        back_track(tong + a[k], k + 1, current);
        current.remove(current.size() - 1);
        
        // Nhánh không chọn phần tử a[k]
        back_track(tong, k + 1, current);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            a = new Integer[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Sắp xếp mảng ban đầu tăng dần để sinh tập con chuẩn thứ tự từ điển
            Arrays.sort(a, 1, n + 1);
            
            results = new ArrayList<>();
            back_track(0, 1, new ArrayList<>());
            
            // Sắp xếp lại danh sách kết quả nếu cần (ví dụ theo độ dài hoặc thứ tự từ điển)
            // Tùy thuộc đề bài yêu cầu tăng dần hay giảm dần mà tinh chỉnh phần này
            Collections.sort(results); 
            
            for (String s : results) {
                System.out.println(s);
            }
        }
    }
}