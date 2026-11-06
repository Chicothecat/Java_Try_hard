package OOP;
import java.util.Scanner;

class ThiSinh{
    private String maTS;
    private String ten;
    private float toan;
    private float ly;
    private float hoa;

    public ThiSinh(String maTS, String ten, float toan, float ly, float hoa){
        this.maTS = maTS;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public String getMaTS() { return maTS; }
    public String getTen() { return ten; }
    public float getToan() { return toan; }
    public float getLy() { return ly; }
    public float getHoa() { return hoa; }
}
class diem_thi {
    private ThiSinh ts;
    
    public diem_thi(ThiSinh ts){
        this.ts = ts;
    }
    public float diem_cong(){
        String khuvuc = ts.getMaTS().substring(0,3);
        if(khuvuc.equals("KV1")) return 0.5f;
        else if(khuvuc.equals("KV2")) return 1.0f;
        else return 2.5f;
    }
    public float tong(){
        return ts.getToan()*2+ts.getLy()+ts.getHoa();
    }
    public float getTong(){
        return tong()+diem_cong();
    }
    public String trang_thai(){
        if(getTong()>=24) return"TRUNG TUYEN";
        else return "TRUOT";
    }
}

public class j4013 {
    
    public static String chuyen_doi(float val){
        if(val==(int) val){
            return String.valueOf((int) val);
        }else{
            return String.valueOf(val);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String maTS = sc.nextLine();
        String ten = sc.nextLine();
        float toan = sc.nextFloat();
        float ly = sc.nextFloat();
        float hoa = sc.nextFloat();
        
        ThiSinh ts = new ThiSinh(maTS,ten,toan,ly,hoa);
        
        diem_thi dt = new diem_thi(ts);
        
        System.out.println(ts.getMaTS()+
            " "+ ts.getTen()+
            " "+ chuyen_doi(dt.diem_cong())+
            " "+ chuyen_doi(dt.tong())+
            " "+ dt.trang_thai());
    }
}

