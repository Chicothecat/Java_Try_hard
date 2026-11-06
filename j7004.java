/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;



import java.io.File;
import java.util.Scanner;

class Dem {
    int so;
    int cnt;

    Dem(int so, int cnt) {
        this.so = so;
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return so + " " + cnt;
    }
}

public class j7004 {
    public static void main(String[] args) throws Exception {
        File f = new File("DATA.out");
        Scanner sc = new Scanner(f);

        int[] cnt = new int[1001];

        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x >= 0 && x <= 1000) {
                cnt[x]++;
            }
        }

        for (int i = 0; i <= 1000; i++) {
            if (cnt[i] > 0) {
                Dem d = new Dem(i, cnt[i]);
                System.out.println(d);
            }
        }

        sc.close();
    }
}