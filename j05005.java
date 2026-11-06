package OOP;
import java.util.*;

class SinhV{
    String msv,ten,lop,dob;
    float gpa;
    SinhV(){
        msv="";
        ten="";
        lop="";
        dob="";
        gpa=0;
    }
    String chuan_hoa_msv(int i){
        return String.format("B20DCCN%03d",i);
    }
    String chuan_hoa_ten(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : words){
            sb.append(Character.toUpperCase(s.charAt(0))).
                    append(x.substring(1).toLowerCase()).
                    append(" ");
        }
        return sb.toString();
    }
    String chuan_hoa_dob(String s){
        String[] x = s.split("/");
        int d = Integer.parseInt(x[0]);
        int m = Integer.parseInt(x[1]);
        int y = Integer.parseInt(x[2]);
        return String.format("%02d/%02d/%04d", d,m,y);
    }
    public static void sort(SinhV[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].gpa < a[j].gpa){
                    SinhV tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    void nhap(Scanner sc, int i){
        msv = chuan_hoa_msv(i);
        ten = chuan_hoa_ten(sc.nextLine());
        lop = sc.nextLine();
        dob = chuan_hoa_dob(sc.nextLine());
        gpa = sc.nextFloat();
        sc.nextLine();
    }
    void in(){
        System.out.printf("%s %s %s %s %.2f \n",msv,ten,lop,dob,gpa);
    }
}

public class j05005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SinhV[] sv = new SinhV[n];
        for(int i=0;i<n;i++){
            sv[i] = new SinhV();
            sv[i].nhap(sc,i);
        }
        SinhV.sort(sv);
        for(SinhV x : sv){
            x.in();
        }
    }
}
