package OOP;
import java.util.Scanner;

class NhanVien{
    private String maNV:
    private String ten;
    private float money;
    
    public NhanVien(String maNV, String ten, String money){
        this.maNv = maNV;
        this.ten = ten;
        this.money = money;
    }
    public String getmaNV(){return maNV;}
    public String getTen(){return ten;}
    public String getMoney(){return money;}
    
}
class Luong{
    private NhanVien nv;
    public Luong(NhanVien nv){
        this.nv = nv;
    }
    public long luong_thuong(){
        String heso = nv.getmaNV().substring(2,3);
        long value = Long.parselLong(heso);
        return 
    }
}

public class j4015 {
    
}
