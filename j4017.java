package OOP;
import java.util.Scanner;

class Matrix{
    private int n,m;
    private int[][] a;
    
    public Matrix(int n, int m){
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }
    public void nextMatrix(Scanner sc){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public Matrix trans(){
        Matrix b =new Matrix(this.m,this.n);
        for(int i=0;i<this.m;i++){
            for(int j=0;j<this.m;j++){
                b.a[i][j] = this.a[i][j];
            }
        }
        return b;
    }
    public Matrix mul(Matrix other){
        Matrix c = new Matrix(this.n,other.m);
        for(int i=0;i<this.n;i++){
            for(int j=0;j<other.m;j++){
                c.a[i][j] = 0;
                for(int k=0;k<this.m;k++){
                    c.a[i][j]+=this.a[n][k]*other.a[k][m];
                }
            }
        }
        return c;
    }
    @Override
    public String toString(){
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               sb.append(a[i][j]).append(" ");
           }
           sb.append("\n");
       }
       return sb.toString();
    }
}

public class j4017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
}
