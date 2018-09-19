/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalanalysis;
class Raphson_method{
    double root=0,error=0,preRoot=0,newRoot=0;
    public double givenFunction(double x){
        return ((Math.pow(x,3))-(0.165*(Math.pow(x, 2)))+3.993*(Math.pow(10, -4)));
    }
    public double derivatibeFunction(double x){
        return ((3*(Math.pow(x, 2)))-(0.33*x));
    }
    public void implementRaphson(double x0,int iteration){
        root=x0-((givenFunction(x0))/derivatibeFunction(x0));
         error = Math.abs((root-x0)/root);
          System.out.println("Root is: "+root+"\t error is: "+error );
          preRoot = root;
        for(int i=1;i<=iteration;i++){
            newRoot = preRoot-((givenFunction(preRoot))/derivatibeFunction(preRoot));
            error = Math.abs((newRoot-preRoot)/newRoot);
            System.out.println("Root is: "+newRoot+"\t error is: "+error );
            preRoot = newRoot;
        }
    }
}
public class Newton_raphson {
    public static void main(String args[]){
        Raphson_method rm=new Raphson_method();
        rm.implementRaphson(0.05, 3);
    }
}
