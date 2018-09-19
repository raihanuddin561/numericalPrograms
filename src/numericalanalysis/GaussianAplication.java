/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalanalysis;

import java.util.Scanner;

/**
 *
 * @author DCL
 */
public class GaussianAplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double arr[][] = new double[3][4];
       // System.out.println("Enter First equation only: ");
        double eq1[] = new double[4];
        System.out.println("Enter the value:");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextDouble();
            }
        }
        for(int i = 0;i<4;i++){
            eq1[i] = arr[0][i];
        }
        double eq5[]=new double[4];
        double cfn=arr[1][0]/arr[0][0];
        for(int i=0;i<4;i++){
            eq5[i]=arr[1][i]-cfn*arr[0][i];
        }
        System.out.println("equation 5 is: ");
         for(int i=0;i<4;i++){
            System.out.print(eq5[i]+" ");
        }
          System.out.println("");
         System.out.println("----------------------------------");
          double eq6[]=new double[4];
        double cfn2=arr[2][0]/arr[0][0];
        for(int i=0;i<4;i++){
            eq6[i]=arr[2][i]-cfn2*arr[0][i];
        }
        System.out.println("equation 6 is: ");
         for(int i=0;i<4;i++){
            System.out.print(eq6[i]+" ");
        }
          System.out.println("");
         System.out.println("----------------------------------");
        double  eq7[]=new double[4];
         double cfn3 = eq6[1]/eq5[1];
         for(int i = 0;i<4;i++){
             eq7[i]=eq6[i]-cfn3*eq5[i];
             //System.out.println("equation 7 is:"+eq7[i]);
         }
          System.out.println("equation 7 is:");
         for(int i = 0;i<4;i++){
            
             System.out.print(eq7[i]+" ");
         }
         System.out.println();
         double b3=eq7[3]/eq7[2];
         System.out.println("Result of b3 is: "+b3);
         
         double b2 = (eq6[3]-(b3*eq6[2]))/eq6[1];
         System.out.println("Result of b2 is: "+b2);
         
         double b1 = (eq1[3]-((eq1[1]*b2)+(eq1[2]*b3)))/eq1[0];
         System.out.println("Result of b1 : "+b1);
          System.out.println("");
         System.out.println("----------------------------------");
         System.out.println("");
        System.out.println("The array is: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("---------------------------------");
        System.out.println("UpperMatrix is:");
       double[][] upperMatrix=new double[3][3];
        for(int i=0;i<3;i++){
          System.out.print(eq1[i]+"\t ");
                  }
        System.out.println();
        for(int i=0;i<3;i++){
          
          System.out.print(eq5[i]+"\t ");
         
        }
          System.out.println();
        for(int i=0;i<3;i++){
         
          System.out.print(eq7[i]+"\t ");
        }
          System.out.println();
    }
    
}
