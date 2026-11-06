import java.util.*;

class MatHang{
    private String ma,ten,loai;
    public MatHang(String ma, String ten, String loai){
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
    }
    public String getLoai(){
        return loai;
    }
    public String getTen(){
        return ten;
    }
}

class Tke{
    private String id;
    private long sluong,price,xuat;
    private MatHang mh;
    public Tke(String id, long sluong, long price, long xuat, MatHang mh){
        this.id = id;
        this.sluong = sluong;
        this.price = price;
        this.xuat = xuat;
        this.mh = mh;
    }
    public long buy(){
        return price*sluong;
    }
    public long sell(){
        if(mh.getLoai().equals("A")) return price*xuat*108/100;
        else if(mh.getLoai().equals("B")) return price*xuat*105/100;
        else return price*xuat*102/100;
    }
    @Override 
    public String toString(){
        return id+" "+mh.getTen()+" "+buy()+" "+sell();
    }
}

public class j5076 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String,MatHang> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String loai = sc.nextLine();
            
            MatHang m = new MatHang(ma,ten,loai);
            map.put(ma, m);
        }
        int m = sc.nextInt();
        ArrayList<Tke> list = new ArrayList<>();
        for(int i=0;i<m;i++){
            String id = sc.next();
            long sluong = sc.nextLong();
            long price = sc.nextLong();
            long xuat = sc.nextLong();
            
            list.add(new Tke(id,sluong,price,xuat,map.get(id)));
        }
        
        for(Tke x : list){
            System.out.println(x);
        }
    }
}
