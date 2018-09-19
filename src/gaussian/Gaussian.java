package gaussian;

import java.util.Scanner;

public class Gaussian {
    
    public static void solve(double[][] A, double[] B){
        int N = B.length;
        for (int k = 0; k < N; k++) 
        {
            for (int i = k + 1; i < N; i++){
                double factor = A[i][k] / A[k][k];
                B[i] -= factor * B[k];
                for (int j = k; j < N; j++){ 
                    A[i][j] -= factor * A[k][j];
                }
            }
        }
        printRowEchelonForm(A, B);
        /** back substitution **/
        double[] solution = new double[N];
        for (int i = N - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < N; j++) {
                sum += A[i][j] * solution[j];
            }
            solution[i] = (B[i] - sum) / A[i][i];
        }        
        /** Print solution **/
        printSolution(solution);
    }
    /** function to print in row form **/
    public static void printRowEchelonForm(double[][] A, double[] B){
        int N = B.length;
        System.out.println("\nRow Echelon form : ");
        for (int i = 0; i < N; i++){
               for (int j = 0; j < N; j++){
                   System.out.printf("%.3f ", A[i][j]);
               }
               System.out.printf("| %.3f\n", B[i]);
        }
        System.out.println();
    }
    /** function to print solution **/
    public static void printSolution(double[] sol){
        int N = sol.length;
        System.out.println("\nSolution : ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.2f ", sol[i]);   
        }
        System.out.println();     
    }  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter number of equations:");
        int N = scan.nextInt();
        double[] B = new double[N];
        double[][] A = new double[N][N];
        System.out.println("\nEnter "+ N +" equations coefficients values:");
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                A[i][j] = scan.nextDouble();
            }
        }
        System.out.println("\nEnter "+ N +" solutions");
        for (int i = 0; i < N; i++){
            B[i] = scan.nextDouble();
        }
        solve(A,B);
    }  
}
