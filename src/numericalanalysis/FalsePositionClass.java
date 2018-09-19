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
class FalsePosition{
     public  double givenFunction(double x){
      return (2*(Math.pow(x,3))-(2.5*x)-5);
  }  
  public void bisectionMethod(double lower,double upper,double iteration){
      
      double error=1,rootLower=0,preRoot=0,preLower=0,preUpper=0;
      double functionOfLower=givenFunction(lower);
      double functionOfUpper=givenFunction(upper);
      double root=upper-((functionOfUpper*(lower-upper))/(functionOfLower-functionOfUpper));
      double functionOfRoot=givenFunction(root);
      rootLower=functionOfLower*functionOfRoot;
      System.out.println("Lower: "+lower+"\t\tUpper: "+upper+"\t\tRoot: "+root+"\t\tFunction of Lower: "+functionOfLower+"\t\tFunction of root: "+functionOfRoot+"\t\tError: "+error);
      //for(int i=0;i<5;i++){
    while(error>=0.05){
         
          if(rootLower<0){
              upper=root;
//              preRoot=root;
//              preLower=lower;
              lower=lower;
              functionOfLower=givenFunction(lower);
              functionOfUpper=givenFunction(upper);
              root=upper-((functionOfUpper*(lower-upper))/(functionOfLower-functionOfUpper));
             // System.out.println("root is:"+root);
          }
          else if(rootLower>0){
//               preRoot=root;
//              preLower=lower;
              lower=root;
              upper=upper;
               functionOfLower=givenFunction(lower);
              functionOfUpper=givenFunction(upper);
              root=upper-((functionOfUpper*(lower-upper))/(functionOfLower-functionOfUpper));
             // System.out.println("root is:"+root);
          }
          else{
              System.out.println("ok");
          }
          error=Math.abs((root-preRoot)/root);
          
           
           preLower=lower;
          preUpper=upper;
          functionOfLower=givenFunction(preLower);
          functionOfUpper=givenFunction(preUpper);
          preRoot=preUpper-((functionOfUpper*(preLower-preUpper))/(functionOfLower-functionOfUpper));
          functionOfRoot=givenFunction(preRoot);
          rootLower=functionOfLower*functionOfRoot;
          System.out.println("Lower: "+lower+"\t\tUpper: "+upper+"\t\tRoot: "+root+"\t\tFunction of Lower: "+functionOfLower+"\t\tFunction of root: "+functionOfRoot+"\t\tError: "+error);

      }
  }
}
public class FalsePositionClass {
    public static void main(String[] args){
        FalsePosition fp=new FalsePosition();
        fp.bisectionMethod(1, 2, 5);
    }
}
