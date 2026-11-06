package OOP;

import java.util.Scanner;
import java.util.Locale;
class SinhVien {
   
    private String msv;
    private String ten;
    private String lop;
    private String dob;
    private float gpa;

    public SinhVien(String ten, String lop, String dob, float gpa) {
        this.msv = "B20DCCN001";
        this.ten = chuan_hoa_ten(ten);
        this.lop = lop;
        this.dob = chuan_hoa_dob(dob);
        this.gpa = gpa;
    }
    
    private String chuan_hoa_msv(String s) {
        String res = "B20DCCN";

        if (s.length() < 3) {
            return res + "00";
        }

        return res;
    }
    
    private String chuan_hoa_dob(String s) {
        StringBuilder sb = new StringBuilder(s);

        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }

        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }

        return sb.toString();
    }

    private String chuan_hoa_ten(String s) {
        String[] word = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length; i++) {
            word[i] = Character.toUpperCase(word[i].charAt(0))
                    + word[i].substring(1);

            sb.append(word[i]);

            if (i < word.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public void in() {
        System.out.printf("%s %s %s %s %.2f\n",
                this.msv, this.ten, this.lop, this.dob, this.gpa);
    }
}

public class j4006 {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        String ten = sc.nextLine();
        String lop = sc.nextLine();
        String dob = sc.nextLine();
        float gpa = sc.nextFloat();

        SinhVien p = new SinhVien(ten, lop, dob, gpa);

        p.in();
    }

    public static void main(String[] args) {
        solve();
    }
}
