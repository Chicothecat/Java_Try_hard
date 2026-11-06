package OOP;
import java.util.Scanner;

class Matrix{
    private int n,m;
    private int[][] a;
    
    public Matrix(int n,int m){
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
    public Matrix mul(Matrix other){
        Matrix c = new Matrix(this.n,other.m);
        for(int i=0;i<this.n;i++){
            for(int j=0;j<other.m;j++){
                c.a[i][j] = 0;
                for(int k=0;k<this.m;k++){
                    c.a[i][j] += this.a[i][k]*other.a[k][j];
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

public class j4016 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
