package OOP;
import java.util.Scanner;

class ThSinh{
    String ten,que,time;
    String ma, vt;
    ThSinh(){
        ten="";
        que="";
        time="";
        ma="";
        vt="";
    }
    int timer(){
        String[] x = time.split(":");
        int h = Integer.parseInt(x[0]);
        int m = Integer.parseInt(x[1]);
        return (h*60+m);
    }
    String chuan_hoa_ma(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        String[] word1 = s1.split(" ");
        String[] word2 = s2.split(" ");
        for(int i=0;i<word1.length;i++){
            sb.append(Character.toUpperCase(word1[i].charAt(0)));
        }
        for(int i=0;i<word2.length;i++){
            sb.append(Character.toUpperCase(word2[i].charAt(0)));
        }
        return sb.toString();
    }
    String van_toc(String s){
        String[] x = s.split(":");
        int h = Integer.parseInt(x[0]);
        int m = Integer.parseInt(x[1]);
        double v = 120.0 /(((h*60+m)-360)/60.0);
        return String.format("%.0f Km/h",v);
    }
    
    void nhap(Scanner sc){
        ten = sc.nextLine();
        que = sc.nextLine();
        time = sc.nextLine();
        ma = chuan_hoa_ma(que,ten);
        vt = van_toc(time);
    }
    void in(){
        System.out.printf("%s %s %s %s\n",ma,ten,que,vt);
    }
    static void sort(ThSinh[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j].timer()<a[i].timer()){
                    ThSinh tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
    }
}

public class j5015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ThSinh[] ts = new ThSinh[n];
        for(int i=0;i<n;i++){
            ts[i] = new ThSinh();
            ts[i].nhap(sc);
        }
        ThSinh.sort(ts);
        for(ThSinh x : ts){
            x.in();
        }
    }
}
