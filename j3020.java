package java_chuong_1.Java_c2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class j3020 {

    static boolean check(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mp = new TreeMap<>();

        // Đọc từng dòng, dừng lại khi gặp một dòng trống
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.trim().isEmpty()) {
                break; // Gặp dòng trống là dừng và in kết quả ngay
            }

            String[] words = line.trim().split("\\s+");
            for (String w : words) {
                if (check(w)) {
                    mp.put(w, mp.getOrDefault(w, 0) + 1);
                }
            }
        }

        // In kết quả
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        sc.close();
    }
}