package OOP;
import java.util.Scanner;

class tam_giac {
    float x, y;
    
    tam_giac() {
        x = 0;
        y = 0;
    }
    
    void nhap(Scanner sc) {
        x = sc.nextFloat();
        y = sc.nextFloat();
    }
    
    float tich_co_huong(tam_giac other) {
        return this.x * other.y - this.y * other.x;
    }
}

public class j5008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            tam_giac[] p = new tam_giac[n];
            for (int i = 0; i < n; i++) {
                p[i] = new tam_giac();
                p[i].nhap(sc);
            }
            float ans = 0;
            for (int i = 0; i < n; i++) {
                int j = (i + 1) % n;
                ans += p[i].x * p[j].y - p[j].x * p[i].y;
            }
            float res = Math.abs(ans) / 2.0f;
            System.out.printf("%.3f\n", res);
        }
        sc.close();
    }
}