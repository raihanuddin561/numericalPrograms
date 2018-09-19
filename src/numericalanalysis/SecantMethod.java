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
class SecAntClass{
    double newroot=0,oldroot=0,error=0,prex_1=0;
     public double givenFunction(double x){
            return (Math.pow(x,3)-0.165*(Math.pow(x, 2))+3.993*(Math.pow(10,-4)));
    }
     public void implementSecant(double x0, double x_1,int iterate){
         oldroot=x0;
         prex_1=x_1;
         for(int i=0;i<iterate;i++){
         newroot=oldroot-((givenFunction(oldroot)*(oldroot-prex_1))/(givenFunction(oldroot)-givenFunction(prex_1)));
         error=Math.abs((newroot-oldroot)/newroot);
         System.out.println(newroot);
         System.out.println(error);
         prex_1=oldroot;
         oldroot=newroot;
         }
     }
}
public class SecantMethod {
    
    public static void main(String[] args){
        SecAntClass sc=new SecAntClass();
       sc.implementSecant(0.05,0.02,4);
    }
}
