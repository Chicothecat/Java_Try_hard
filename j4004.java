package OOP;
import java.util.Scanner;

class PhanSo{
    private long tu;
    private long mau;
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    private long gcd(long a, long b){
        while(b!=0){
            long tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public void cong_phanso(PhanSo p2){
        if(this.mau == p2.mau){
            this.tu = this.tu + p2.tu;
        }
        else{
            this.tu = this.tu*p2.mau + p2.tu*this.mau;
            this.mau = this.mau*p2.mau;
        }
    }
    
    public void rut_gon(){
        long ucln = gcd(this.tu,this.mau);
        this.tu /= ucln;
        this.mau /= ucln;
    }
    public void in(){
        System.out.println(this.tu+"/"+this.mau);
    }
}

public class j4004 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        // P1
        Long x = sc.nextLong();
        Long y = sc.nextLong();
        // P2
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        
        PhanSo p1 = new PhanSo(x,y);
        PhanSo p2 = new PhanSo(a,b);
        
        p1.cong_phanso(p2);
        p1.rut_gon();
        p1.in();
    }
    public static void main(String[] args){
        solve();
    }
}
