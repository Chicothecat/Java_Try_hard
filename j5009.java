package OOP;
import java.util.Scanner;

class ThiSinhThi{
    String ma;
    String ten,dob;
    float diem1,diem2,diem3;
    float gpa;
    ThiSinhThi(){
        ma="";
        ten ="";
        dob="";
        gpa=0;
        diem1=0;
        diem2=0;
        diem3=0;
    }
    float tong_diem(){
        return diem1+diem2+diem3;
    }
    String chuan_hoa_ma(int i){
        return String.format("%01d",i+1);
    }
    void nhap(Scanner sc,int i){
        ma = chuan_hoa_ma(i);
        ten = sc.nextLine();
        dob = sc.nextLine();
        diem1 = Float.parseFloat(sc.nextLine());
        diem2 = Float.parseFloat(sc.nextLine());
        diem3 = Float.parseFloat(sc.nextLine());
        gpa = tong_diem();
    }
    void in(){
        System.out.printf("%s %s %s %.1f\n",ma,ten,dob,gpa);
    }
}

public class j5009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ThiSinhThi[] ts = new ThiSinhThi[n];
        float max = 0;
        for(int i=0;i<n;i++){
            ts[i] = new ThiSinhThi();
            ts[i].nhap(sc,i);
            if(ts[i].gpa > max){
                max = ts[i].gpa;
            }
        }
        for(int i=0;i<n;i++){
            if(ts[i].gpa == max){
                ts[i].in();
            }
        }
    }
}
