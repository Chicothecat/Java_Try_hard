import java.util.*;

class GVT{
    String ten, maGV, maXT, status, mon;
    float diemTin, diemCM, tong, diemUT;

    GVT(){
        ten = "";
        maGV = "";
        maXT = "";
        status = "";
        mon = "";
        diemTin = diemCM = tong = diemUT = 0;
    }

    String chuanHoaMaGV(int i){
        return String.format("GV%02d", i);
    }

    float maUuTien(){
        int x = Integer.parseInt(maXT.substring(1));

        if(x == 1) return 2.0f;
        else if(x == 2) return 1.5f;
        else if(x == 3) return 1.0f;
        else return 0f;
    }

    String monHoc(){
        if(maXT.charAt(0) == 'A') return "TOAN";
        else if(maXT.charAt(0) == 'B') return "LY";
        else return "HOA";
    }

    String res(){
        if(tong >= 18) return "TRUNG TUYEN";
        return "LOAI";
    }

    void nhap(Scanner sc, int i){
        ten = sc.nextLine();
        maXT = sc.nextLine();

        diemTin = Float.parseFloat(sc.nextLine());
        diemCM = Float.parseFloat(sc.nextLine());

        maGV = chuanHoaMaGV(i);

        diemUT = maUuTien();
        mon = monHoc();

        tong = diemTin * 2 + diemCM + diemUT;
        status = res();
    }

    void xuat(){
        System.out.printf("%s %s %s %.1f %s\n",
                maGV, ten, mon, tong, status);
    }

    static void sort(GVT[] a){
        for(int i = 0; i < a.length - 1; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[j].tong > a[i].tong){
                    GVT tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}

public class J5014{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        GVT[] ds = new GVT[n];

        for(int i = 0; i < n; i++){
            ds[i] = new GVT();
            ds[i].nhap(sc, i + 1);
        }

        GVT.sort(ds);

        for(int i = 0; i < n; i++){
            ds[i].xuat();
        }
    }
}