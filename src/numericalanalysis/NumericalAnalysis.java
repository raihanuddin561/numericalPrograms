/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalanalysis;

/**
 *
 * @author DCL
 */
class BisectionClass{
    public double givenFunction(double x){
            return (Math.pow(x,3)+(3*x)-5);
    }
    public void bisectionMethod(double lower,double upper,double iteration){
        double root=(lower+upper)/2;
        double oldRoot=0,newRoot=0,newLower=0,newUpper=0,error=0;
        double functionOfLower=givenFunction(lower);
        double functionOfRoot=givenFunction(root);
        int count=0;
        //double rootLower=functionOfLower*functionOfRoot;
        double rootLower=0;
        oldRoot=root;
       // rootLower=functionOfLower*functionOfRoot;
       // error=Math.abs((newRoot-oldRoot)/newRoot);
        error=0.1;
       // System.out.println("Lower: "+lower+"\t\t Upper: "+upper+"\t\t Root"+oldRoot+"\t\t Function of lower: "+functionOfLower+"\t\t Function of root: "+functionOfRoot+"\t\t Error: "+error);
     // for(int i=0;i<iteration;i++){
           while(error>=0.01){
               if(count==0){
                    System.out.println("Lower: "+lower+"\t\t Upper: "+upper+"\t\t Root"+oldRoot+"\t\t Function of lower: "+functionOfLower+"\t\t Function of root: "+functionOfRoot+"\t\t Error: "+error);
               }
               else{
                   
                functionOfLower=givenFunction(lower);
              functionOfRoot=givenFunction(oldRoot);
              rootLower=functionOfLower*functionOfRoot;
            if(rootLower<0){
               upper=oldRoot;
               lower=lower;
               
               newRoot=(lower+upper)/2;
               oldRoot=newRoot;
            }
            else if(rootLower>0){
//                newLower=root;
//                newRoot=(newLower+upper)/3;
               upper=upper;
                lower=oldRoot;
               
                newRoot=(lower+upper)/2;
                 oldRoot=newRoot;
            }
            else{
               // newRoot=root;
//               oldRoot=newRoot;
//               newRoot=newRoot;
            }
            if(count>0){
                error=Math.abs((newRoot-oldRoot)/newRoot);
                System.out.println("Lower: "+lower+"\t\t Upper: "+upper+"\t\t Root:"+newRoot+"\t\t Function of lower: "+functionOfLower+"\t\t Function of root: "+functionOfRoot+"\t\t Error: "+error);
            }
//            functionOfLower=givenFunction(lower);
//              functionOfRoot=givenFunction(newRoot);
//              rootLower=functionOfLower*functionOfRoot;
              count++;
               }
              
        }
    }
}
public class NumericalAnalysis {

    public static void main(String[] args) {
        BisectionClass bc=new BisectionClass();
        bc.bisectionMethod(1, 2, 3);
        
    }
    
}
