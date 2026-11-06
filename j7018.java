import java.util.*;
import java.io.*;

class SVien{
    String msv,ten,dob,lop;
    double gpa;
    SVien(){
        msv = "";
        ten ="";
        dob="";
        lop="";
        gpa=0;
    }
    String chuan_hoa_msv(int i){
        return String.format("B20DCCN%03d",i);
    }
    String chuan_hoa_dob(String s){
        String[] word = s.split("/");
        int d = Integer.parseInt(word[0]);
        int m = Integer.parseInt(word[1]);
        int y = Integer.parseInt(word[2]);
        return String.format("%02d/%02d/%04d",d,m,y);
    }
    String chuan_hoa_ten(String s){
        StringBuilder sb = new StringBuilder();
        String[] words = s.split("\\s+");
        for(String x : words){
            if(x.isEmpty()) continue;
            sb.append(Character.toUpperCase(x.charAt(0))).
                    append(x.substring(1).toLowerCase()).
                    append(" ");
        }
        return sb.toString().trim();
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", msv, ten, lop, dob, gpa);
    }
}

public class j7018 {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File("SINHVIEN.in"));
            int n= sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++){
                SVien sv = new SVien();
                sv.ten = sv.chuan_hoa_ten(sc.nextLine());
                sv.lop = sc.nextLine();
                sv.dob = sv.chuan_hoa_dob(sc.nextLine());
                sv.gpa = Double.parseDouble(sc.nextLine().trim());
                sv.msv = sv.chuan_hoa_msv(i+1);
                System.out.println(sv);
            }
            sc.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
