package OOP;
import java.util.*;

class Time{
    String ma,ten,start,end,res;
    Time(){
        ma = "";
        ten ="";
        start="";
        end="";
        res="";
    }
    int time_check(){
        String[] a = start.split(":");
        String[] b = end.split(":");
        int vao = Integer.parseInt(a[0])*60 + Integer.parseInt(a[1]);
        int ra = Integer.parseInt(b[0])*60 + Integer.parseInt(b[1]);
        return ra - vao;
    }
    static void sort(Time[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j].time_check()>a[i].time_check()){
                    Time tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    String tinh_time(){
       int ans = time_check();
       return ans/60 + " gio " + ans%60 + " phut ";
    }
    void nhap(Scanner sc){
        ma = sc.nextLine();
        ten = sc.nextLine();
        start = sc.nextLine();
        end = sc.nextLine();
        res= tinh_time();
    }
    void in(){
        System.out.printf("%s %s %s\n",ma,ten,res);
    }
}

public class j5011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Time[] a = new Time[n];
        for(int i=0;i<n;i++){
            a[i] = new Time();
            a[i].nhap(sc);
        }
        Time.sort(a);
        for(Time x : a){
            x.in();
        }
    }
}
