package bisection.with.hashmap;

import java.text.DecimalFormat;
import java.util.HashMap;

class Bisection{
    //HashMap<String,Double> map=new HashMap<String,Double>();
    double root=0,f_of_lower=0,f_of_root=0,root_and_lower=0,error=0,new_root=0,percentile=0;
    DecimalFormat df = new DecimalFormat("####0.00");
    public double function(double value){
        return (value*3)-5;
    }
    
    public void calculate(double lower,double upper,double approx_relative_error){
        root=(lower+upper)/2;
        f_of_lower=function(lower);
        f_of_root=function(root);
        root_and_lower=f_of_lower*f_of_root;
        System.out.printf("Lower : "+lower+"\tUpper : "+upper+"\tRoot : "+root+"\tLower*root : "+(root_and_lower)+"\tFunction of lower:"+f_of_lower+"\t\tFunction of root:"+f_of_root);
        percentile=error*100;
        System.out.println("\t\tError : " + df.format(percentile)+"%");
        if(root_and_lower>0){
            lower=root;
        }
        else if(root_and_lower<0){
            upper=root;
        }
        else{
            root=root;
        }
        new_root=(upper+lower)/2;
        error=Math.abs((new_root-root)/new_root);
        //System.out.println("New root:"+new_root+"\tOld root:"+root);     
        if(error<0.001){
            System.out.println("Error: "+error+" is less than given error 0.001.");
            System.exit(0);
        }
        else{
            calculate(lower, upper, error);
        }
    }
}
public class BisectionWithHashmap {

    public static void main(String[] args) {
        Bisection b=new  Bisection();
        b.calculate(1, 2, 0.001);
    }
    
}
