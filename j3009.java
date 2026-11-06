package java_chuong_1.Java_c2;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class j3009 {
    static Scanner sc = new Scanner(System.in);
    
    static int dem(String s, int cnt_kitu){
        int cnt[]={0} = new int[1001];
        String[] word = s.trim().split("\\s+");
        for(int i=0;i<word.length;i++){
            cnt_kitu = cnt[word[i]]++;
        }
        return cnt_kitu;
    }
    static void solve(){
        String s1 = sc.nextInt();
        String s2 = sc.nextInt();
        if(dem(s1,0) > 1 )
    }
}