import java.util.Random;

public class Macierz {
    public static void fill(int[][] M, int k){
        Random generator = new Random();
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M.length; j++) {
                M[i][j] = generator.nextInt(k);
            }
        }
    }
    public static void print (int[][] M){
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M.length; j++) {
                System.out.print(M[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    public static int[][] iloczyn (int[][] A,int[][] B){
        int x = A.length;
        int[][] M = new int[x][x];
        for(int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                int temp = 0;
                for(int k = 0;k < x; k++){
                    temp += A[i][k]*B[k][j];
                }
                M[i][j] = temp;
            }
        }
        return M;
    }

    public static int[][] suma (int[][] A,int[][] B){
        int x = A.length;
        int[][] M = new int[x][x];
        for(int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = A[i][j] + B[i][j];
            }
        }
        return M;
    }
}
