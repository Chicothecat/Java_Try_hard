package OOP;
import java.util.*;

class Hang{
    String ma,ten,loai;
    float mua,ban;
    float gia;
    Hang(){
        ma = "";
        ten="";
        loai="";
        mua = 0;
        ban=0;
        gia =0;
    }
    String chuan_hoa_ma(int i){
        return String.format("%01d",i);
    }
    float profit(){
        return ban - mua;
    }
    void nhap(Scanner sc, int i){
        ma = chuan_hoa_ma(i);
        ten = sc.nextLine();
        loai = sc.nextLine();
        mua = Float.parseFloat(sc.nextLine());
        ban = Float.parseFloat(sc.nextLine());
        gia = profit();
    }
    static void sort(Hang[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j].gia > a[i].gia){
                    Hang tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    void in(){
        System.out.printf("%s %s %s %.2f \n",ma,ten,loai,gia);
    }
}

public class j5010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Hang[] item = new Hang[n];
        for(int i=0;i<n;i++){
            item[i] = new Hang();
            item[i].nhap(sc,i+1);
        }
        Hang.sort(item);
        for(Hang x : item){
            x.in();
        }
    }
}
