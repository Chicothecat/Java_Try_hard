package OOP;
import java.util.Scanner;

class PhanSo {
    private long tu,mau;
    
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public static long gcd(long a,long b){
        while(b!=0){
            long tmp = b;
            b = a%b;
            a = tmp;
        }
        return Math.abs(a);
    }
    public void rut_gon(){
        long g = gcd(this.tu, this.mau);
        this.tu /= g;
        this.mau /= g;
    }
    public PhanSo cong(PhanSo other){
        long t = this.tu*other.mau + other.tu*this.mau;
        long m = this.mau*other.mau;
        PhanSo p = new PhanSo(t,m);
        p.rut_gon();
        return p;
    }
    public PhanSo nhan(PhanSo other){
        long t = this.tu*other.tu;
        long m = this.mau*other.mau;
        PhanSo p = new PhanSo(t,m);
        p.rut_gon();
        return p;
    }
    @Override
    public String toString(){
        return tu+"/"+mau;
    }
}

public class j4012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long tu1 = sc.nextLong();
            long mau1 = sc.nextLong();
            PhanSo p1 = new PhanSo(tu1,mau1);

            long tu2 = sc.nextLong();
            long mau2 = sc.nextLong();
            PhanSo p2 = new PhanSo(tu2,mau2);

            PhanSo tong = p1.cong(p2);
            PhanSo c = tong.nhan(tong);

            PhanSo d = p1.nhan(p2).nhan(c);

            System.out.println(c+" "+d);
        }
    }
}
