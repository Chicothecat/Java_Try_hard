import java.util.*;
import java.io.*;

// Data1 : San Pham 
// Data2: Hoa Don 

// Ket qua: Ma day du - Ten San Pham - Giam gia - Phai Tra 

class SPham{
    String ma,ten;
    long gia1, gia2;
    public SPham(String ma, String ten, long gia1, long gia2){
        this.ma = ma;
        this.ten = ten;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }
}
class HoaDon{
    String ma;
    int soLuong;
    SPham sp;
    public HoaDon(String ma, int soLuong, SPham sp){
        this.ma = ma;
        this.soLuong = soLuong;
        this.sp = sp;
    }
    public long select_price(){
        long gia;
        if(ma.charAt(2)=='1'){
            gia = sp.gia1;
        }else{
            gia = sp.gia2;
        }
        return gia*soLuong;
    }
    public long giam_gia(){
        long sale = select_price();
        if(soLuong >= 150) return sale * 50/100;
        else if(soLuong >= 100) return sale*30/100;
        else if(soLuong >=50) return sale*15/100;
        else return 0;
    }
    public long paid(){
        return select_price() - giam_gia();
    }
    @Override
    public String toString(){
        return ma+" "+sp.ten+" "+giam_gia()+" "+paid();
    }
}

// Struct hoadon = ma + pricetage + id

public class j7019 {
    public static void main(String[] args) throws Exception{
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        HashMap<String, SPham> map = new HashMap<>();
        
        // Doc va luu san pham 
        int n = Integer.parseInt(sc1.nextLine());
        for(int i=0;i<n;i++){
            String ma = sc1.nextLine();
            String ten = sc1.nextLine();
            long gia1 = Long.parseLong(sc1.nextLine());
            long gia2 = Long.parseLong(sc1.nextLine());
            
            SPham sp = new SPham(ma,ten,gia1,gia2);
            
            map.put(ma,sp);
        }
        int m = Integer.parseInt(sc2.nextLine());
        for(int i=1;i<=m;i++){
            String og_code = sc2.next();
            int soLuong = sc2.nextInt();
            
            String type = og_code.substring(0,2);
            
            SPham sp = map.get(type);
            
            String code = og_code+"-"+String.format("%03d",i);
            
            HoaDon hd = new HoaDon(code,soLuong,sp);
            System.out.println(hd);
        }
        sc1.close();
        sc2.close();
    }
}
