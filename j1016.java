package java_chuong_1;
import java.util.Scanner;

public class j1016 {
    static Scanner sc = new Scanner(System.in);
    
    public static double solve() {
        // Nhâp input
        double m = sc.nextDouble(); // Khối lượng nghỉ m0
        double v = sc.nextDouble(); // Vận tốc v
        double c = sc.nextDouble(); // Vận tốc ánh sáng c
        
        // Tính mẫu số
        double mẫu = Math.sqrt(1 - (v * v) / (c * c));
        
        // Tính năng lươgnj
        double E = (m * c * c) / mẫu;
        
        return E;
    }

    public static void main(String[] args) {
        System.out.print("Nhập m, v, c: ");
        double E = solve();
        System.out.println("Năng lượng E = " + E);
    }   
}