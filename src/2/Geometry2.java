import java.util.*;
public class Geometry2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double x1=in.nextDouble();
        double y1=in.nextDouble();
        double r1=in.nextDouble();
        double x2=in.nextDouble();
        double y2=in.nextDouble();
        double r2=in.nextDouble();
        double dtc=Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2), 0.5);
        if(dtc<=Math.abs(r1-r2))System.out.println("circle2 is inside circle1");
        else if(dtc<=r1+r2) System.out.println("circle2 overlaps circle1");
        else System.out.println("circle2 does not overlap circle1");
    }
}
