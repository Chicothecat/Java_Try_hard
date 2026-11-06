package OOP;
import java.util.*;

class Sinh{
    String msv, ten, lop ,dob;
    float gpa;
    Sinh(){
        msv = "";
        ten="";
        lop="";
        dob="";
        gpa=0;
    }
    String chuan_hoa_msv(int i){
        return String.format("B20DCCN%03d",i);
    }
    String chuan_hoa_dob(String s){
        String[] x = s.split("/");
        int d = Integer.parseInt(x[0]);
        int m = Integer.parseInt(x[1]);
        int y = Integer.parseInt(x[2]);
        return String.format("%02d/%02d/%04d",d,m,y);
    }
    String chuan_hoa_ten(String s){
      StringBuilder sb = new StringBuilder();
      String[] words = s.trim().split("\\s+");
      for(String x : words){
          if(x.isEmpty())continue;
            sb.append(Character.toUpperCase(x.charAt(0))).
                    append(x.substring(1).toLowerCase()).
                    append(" ");
      }
      return sb.toString().trim();
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

public class j5003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Sinh[] sv = new Sinh[n+1];
        for(int i=1;i<=n;i++){
            sv[i] = new Sinh();
            sv[i].nhap(sc,i);
            sv[i].in();
        }
    }
}

