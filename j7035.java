import java.util.*;
import java.io.*;

class SV {
    private String ma, ten, lop, email;

    public SV(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = "";
        for (String x : ten.trim().toLowerCase().split("\\s+"))
            this.ten += Character.toUpperCase(x.charAt(0))
                    + x.substring(1) + " ";
        this.ten = this.ten.trim();
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop;
    }
}

class Monhoc {
    private String ma, ten, tc;

    Monhoc(String ma, String ten, String tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }

    public String getTen() {
        return ten;
    }
}

class BangDiem {
    String msv, ma_mon;
    float diem_so;
    private SV sv;
    private Monhoc mh;

    BangDiem(String msv, String ma_mon, float diem_so, SV sv, Monhoc mh) {
        this.msv = msv;
        this.ma_mon = ma_mon;
        this.diem_so = diem_so;
        this.sv = sv;
        this.mh = mh;
    }

    @Override
    public String toString() {
        String diem = diem_so == (int) diem_so
                ? String.valueOf((int) diem_so)
                : String.valueOf(diem_so);
        return sv + " " + diem;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(new BufferedInputStream(
                new FileInputStream("SINHVIEN.in")
        ));

        HashMap<String, SV> ds = new HashMap<>();
        int n = Integer.parseInt(sc1.nextLine());

        for (int i = 0; i < n; i++) {
            String ma = sc1.nextLine();
            String ten = sc1.nextLine();
            String lop = sc1.nextLine();
            String email = sc1.nextLine();

            SV sv = new SV(ma, ten, lop, email);
            ds.put(ma, sv);
        }
        sc1.close();

        Scanner sc2 = new Scanner(new BufferedInputStream(
                new FileInputStream("MONHOC.in")
        ));

        HashMap<String, Monhoc> mon = new HashMap<>();
        int m = Integer.parseInt(sc2.nextLine());

        for (int i = 0; i < m; i++) {
            String ma = sc2.nextLine();
            String ten = sc2.nextLine();
            String tc = sc2.nextLine();

            Monhoc mh = new Monhoc(ma, ten, tc);
            mon.put(ma, mh);
        }
        sc2.close();

        Scanner sc3 = new Scanner(new BufferedInputStream(
                new FileInputStream("BANGDIEM.in")
        ));

        ArrayList<BangDiem> list = new ArrayList<>();
        int k = Integer.parseInt(sc3.nextLine());

        for (int i = 0; i < k; i++) {
            String msv = sc3.next();
            String ma_mon = sc3.next();
            float diem_so = Float.parseFloat(sc3.next());

            list.add(new BangDiem(
                    msv, ma_mon, diem_so, ds.get(msv), mon.get(ma_mon)
            ));
        }

        list.sort((a, b) -> {
            int cmp = Float.compare(b.diem_so, a.diem_so);
            return cmp != 0 ? cmp : a.msv.compareTo(b.msv);
        });

        int q = sc3.nextInt();
        while (q-- > 0) {
            String ma = sc3.next();
            System.out.println("BANG DIEM MON " + mon.get(ma).getTen() + ":");

            for (BangDiem x : list)
                if (x.ma_mon.equals(ma))
                    System.out.println(x);
        }
        sc3.close();
    }
}