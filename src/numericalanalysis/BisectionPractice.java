/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalanalysis;
class Bisection{
  public  double givenFunction(double x){
      return (Math.pow(x,3)+3*x-5);
  }  
  public void bisectionMethod(double lower,double upper,double iteration){
      double root=(lower+upper)/2;
      double error=1,rootLower=0,preRoot=0,preLower=0;
      double functionOfLower=givenFunction(lower);
      double functionOfRoot=givenFunction(root);
      rootLower=functionOfLower*functionOfRoot;
      System.out.println("Lower: "+lower+"\t\tUpper: "+upper+"\t\tRoot: "+root+"\t\tFunction of Lower: "+functionOfLower+"\t\tFunction of root: "+functionOfRoot+"\t\tError: "+error);
      //for(int i=0;i<5;i++){
    while(error>=0.1){
         
          if(rootLower<0){
              upper=root;
//              preRoot=root;
//              preLower=lower;
              lower=lower;
              root=(lower+upper)/2;
             // System.out.println("root is:"+root);
          }
          else if(rootLower>0){
//               preRoot=root;
//              preLower=lower;
              lower=root;
              upper=upper;
              root=(lower+upper)/2;
             // System.out.println("root is:"+root);
          }
          else{
              System.out.println("ok");
          }
          error=Math.abs((root-preRoot)/root);
           preRoot=root;
           preLower=lower;
          functionOfLower=givenFunction(preLower);
          functionOfRoot=givenFunction(preRoot);
          rootLower=functionOfLower*functionOfRoot;
          System.out.println("Lower: "+lower+"\t\tUpper: "+upper+"\t\tRoot: "+root+"\t\tFunction of Lower: "+functionOfLower+"\t\tFunction of root: "+functionOfRoot+"\t\tError: "+error);

      }
  }
}
/**
 *
 * @author DCL
 */
public class BisectionPractice {
    public static void main(String[] args){
        Bisection b=new Bisection();
        b.bisectionMethod(1, 2, 3);
    }
}
