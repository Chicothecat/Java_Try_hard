import java.util.*;
import java.io.*;

public class Main {
    public static boolean check(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(
            new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        
        in.close();
        
        int[] cnt = new int[10001];
        for(int x : list){
            if(check(x)){
                cnt[x]++;
            }
        }
        for(int i=2;i<10001;i++){
            if(cnt[i]>0){
                System.out.println(i+" "+cnt[i]);
            }
        }
    }
}
