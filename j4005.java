package OOP;
import java.util.Scanner;

class SinhVien{
    private String ten;
    private String dob;
    private float diem1;
    private float diem2;
    private float diem3;
    private float gpa;
    
    public SinhVien(String ten, String dob, float diem1, float diem2, float diem3){
        this.ten = ten;
        this.dob = dob;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.gpa = tong_diem();
    }
    private float tong_diem(){
        return this.diem1 + this.diem2 + this.diem3;
    }
    public void in(){
        System.out.printf("%s %s %.1f\n", ten, dob, gpa);
    }
}

public class j4005 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        String ten = sc.nextLine();
        String dob = sc.nextLine();
        float diem1 = sc.nextFloat();
        float diem2 = sc.nextFloat();
        float diem3 = sc.nextFloat();
        
        SinhVien p = new SinhVien(ten,dob,diem1,diem2,diem3);
        
        p.in();
    }
    public static void main(String[] args){
        solve();
    }
}
