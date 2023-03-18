import java.util.*;
public class Algebra {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a, b, c:");
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        double dt=Math.pow(b*b-4*a*c, 0.5);
        if(dt>0) System.out.print("The roots are "+(-b+dt)/(a*2.0)+ " and " +(-b-dt)/(a*2.0));
        else if(dt==0) System.out.print("The roots are "+(-b)/(a*2.0));
        else System.out.print("The equation has no real roots");
        
    }
}
