import java.util.*;
import java.io.*;

class SinhVien {
    private String ma, ten, sdt;

    public SinhVien(String ma, String ten, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sdt;
    }
}

class Bai {
    private String bai;

    public Bai(String bai) {
        this.bai = bai;
    }

    @Override
    public String toString() {
        return bai;
    }
}

class nhom {
    private String masv;
    private int stt;
    private SinhVien sv;
    private Bai b;

    public nhom(String masv, int stt, SinhVien sv, Bai bai) {
        this.masv = masv;
        this.stt = stt;
        this.sv = sv;
        this.b = bai;
    }

    public String getMasv() {
        return masv;
    }

    @Override
    public String toString() {
        return sv + " " + stt + " " + b;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedInputStream(
            new FileInputStream("SINHVIEN.in")
        ));
        HashMap<String, SinhVien> ds = new HashMap<>();

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String sdt = sc.nextLine();

            SinhVien sv = new SinhVien(ma, ten, sdt);
            ds.put(ma, sv);
        }
        sc.close();

        Scanner sc2 = new Scanner(new BufferedInputStream(
            new FileInputStream("BAITAP.in")
        ));
        int m = Integer.parseInt(sc2.nextLine());
        Bai[] bt = new Bai[m + 1];
        for (int i = 1; i <= m; i++) {
            bt[i] = new Bai(sc2.nextLine());
        }
        sc2.close();

        Scanner sc3 = new Scanner(new BufferedInputStream(
            new FileInputStream("NHOM.in")
        ));
        ArrayList<nhom> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ma = sc3.next();
            int stt = sc3.nextInt();

            nhom x = new nhom(ma, stt, ds.get(ma), bt[stt]);
            list.add(x);
        }
        sc3.close();

        list.sort(Comparator.comparing(nhom::getMasv));

        for (nhom x : list) {
            System.out.println(x);
        }
    }
}