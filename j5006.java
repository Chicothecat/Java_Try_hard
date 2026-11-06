
package OOP;
import java.util.*;

class cty{
    String msv,ten,dob,dia_chi,sdt,date,gender;
    cty(){
        msv="";
        ten="";
        gender="";
        dob="";
        dia_chi="";
        sdt="";
        date="";
    }
    String chuan_hoa_msv(int i){
        return String.format("%05d",i);
    }
    void nhap(Scanner sc, int i){
        msv = chuan_hoa_msv(i);
        ten = sc.nextLine();
        gender = sc.nextLine();
        dob = sc.nextLine();
        dia_chi = sc.nextLine();
        sdt = sc.nextLine();
        date = sc.nextLine();
    }
    void in(){
        System.out.printf("%s %s %s %s %s %s %s\n",msv,ten,gender,dob,dia_chi,sdt,date);
    }
}

public class j5006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        cty[] ct = new cty[n];
        for(int i=0;i<n;i++){
            ct[i] = new cty();
            ct[i].nhap(sc,i+1);
        }
        for(cty x : ct){
            x.in();
        }
    }
}
