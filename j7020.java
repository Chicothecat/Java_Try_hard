import java.util.*;
import java.io.*;

class KHang{
    String ma, tenk, gender, dob, dc;
    public KHang(String ma, String ten, String gender, String dob, String dc){
        this.ma = ma;
        this.tenk = ten;
        this.gender = gender;
        this.dob = dob;
        this.dc = dc;
    }
}

class MHang{
    String ma, tenm, dvi;
    Long buy, sell;
    public MHang(String ma, String ten, String dvi, Long buy, Long sell){
        this.ma = ma;
        this.tenm = ten;
        this.dvi = dvi;
        this.buy = buy;
        this.sell = sell;
    }
}

class HDon {
    String maHD, maKH, matHang;
    int sluong;
    KHang k; 
    MHang m;
    public HDon(String maHD, String maKH, String matHang, int sluong,KHang k, MHang m){
        this.maHD = maHD;
        this.maKH = maKH;
        this.matHang = matHang;
        this.sluong = sluong;
        this.k = k;
        this.m = m;
    }
    public long full_price(){
        return m.sell*sluong;
    }
    
    @Override
    public String toString(){
        return maHD+" "+k.tenk+" "+k.dc+" " + m.tenm+" "
                +m.dvi+" "+m.buy+" "+m.sell+" "+sluong
                +" "+full_price();
    }
}

public class j7020 {
    public static void main(String[] args) throws Exception{
        Scanner sc1 = new Scanner(new File("KH.in"));
        Scanner sc2 = new Scanner(new File("MH.in"));
        Scanner sc3 = new Scanner(new File("HD.in"));
        
        HashMap<String, KHang> kh = new HashMap<>();
        HashMap<String, MHang> mh = new HashMap<>();
        
        int n = Integer.parseInt(sc1.nextLine());
        for(int i=1;i<=n;i++){
            String ma = String.format("KH%03d",i);
            String ten = sc1.nextLine();
            String gender = sc1.nextLine();
            String dob = sc1.nextLine();
            String dc = sc1.nextLine();
            
            KHang k = new KHang(ma,ten,gender,dob,dc);
            kh.put(ma,k);
        }
        int m = Integer.parseInt(sc2.nextLine());
        for(int i=1;i<=m;i++){
            String ma = String.format("MH%03d",i);
            String ten = sc2.nextLine();
            String dvi = sc2.nextLine();
            Long buy = Long.parseLong(sc2.nextLine());
            Long sell = Long.parseLong(sc2.nextLine());
            
            MHang item = new MHang(ma,ten,dvi,buy,sell);
            mh.put(ma,item);
        }
        int h = Integer.parseInt(sc3.nextLine());
        for(int i=1;i<=h;i++){
            String maKH = sc3.next();
            String maMH = sc3.next();
            int sluong = sc3.nextInt();
            
            KHang k = kh.get(maKH);
            MHang mhang = mh.get(maMH);
            
            String maHD = String.format("HD%03d",i);
            HDon hd = new HDon(maHD, maKH, maMH,sluong,k,mhang);
            System.out.println(hd);
        }
        sc1.close();
        sc2.close();
        sc3.close();
    }
}
