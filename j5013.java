package OOP;
import java.util.*;

class GV{
    String msv,ten,status;
    float diem1,diem2,res;
    GV(){
        msv="";
        ten="";
        status="";
        diem1=0;
        diem2=0;
    }
    float diem_TB(){
        if(diem1>=10) diem1 = diem1/10;
        if(diem2>=10) diem2 = diem2/10;
        return (diem1+diem2)/2;
    }
    
    String chuan_hoa_msv(int i){
        return String.format("TS%02d",i);
    }
    String check(){
        float a = diem_TB();
        if(a<5) return String.format("TRUOT");
        else if (a>=5 && a<8) return String.format("CAN NHAC");
        else if (a>=8 && a<=9.5) return String.format("DAT");
        else return String.format("XUAT XAC"); 
    }
    void nhap(Scanner sc,int i){
        msv = chuan_hoa_msv(i);
        ten = sc.nextLine();
        diem1 = Float.parseFloat(sc.nextLine());
        diem2 = Float.parseFloat(sc.nextLine());
        res = diem_TB();
        status = check();
    }
    void in(){
        System.out.printf("%s %s %.2f %s\n",msv,ten,res,status);
    }
    static void sort(GV[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
               
                    if(a[j].diem_TB() > a[i].diem_TB()){
                        GV tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                }
            }
        }
    }
}

public class j5013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        GV[] a = new GV[n];
        for(int i=0;i<n;i++){
            a[i] = new GV();
            a[i].nhap(sc,i+1);
        }
        GV.sort(a);
        for(GV x : a){
            x.in();
        }
    }
}
