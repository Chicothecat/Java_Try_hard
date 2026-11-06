import java.util.*;
import java.io.*;

class Pair<t1,t2> {
    private t1 first;
    private t2 second;
    public Pair(t1 first, t2 second){
        this.first = first;
        this.second = second;
    }
    private boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>=2;
    }
    public boolean isPrime(){
        return isPrime((Integer)first) && isPrime((Integer)second);
    }
    @Override 
    public String toString(){
        return first+" "+second;
    }
    
}



public class j7017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
