package OOP;
import java.util.Scanner;

class Point{
    private long tu;
    private long mau;
    
    public Point(long tu,long mau){
        this.tu = tu;
        this.mau = mau;
    }
    
    private long gcd(long a,long b){
        while(b!=0){
            long tmp = a%b;
            a=b;
            b=tmp;
        }
        return a;
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

public class j4003 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        Long x = sc.nextLong();
        Long y = sc.nextLong();
        
        Point p = new Point(x,y);
        p.rut_gon();
        p.in();
    }
    public static void main(String[] args){
        solve();
    }
}
