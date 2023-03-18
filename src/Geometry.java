import java.util.*;
//import java.util;
public class Geometry {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three points for a triangle:");
    float a1=input.nextFloat();
    float a2=input.nextFloat();
    float b1=input.nextFloat();
    float b2=input.nextFloat();
    float c1=input.nextFloat();
    float c2=input.nextFloat();
    double s,s1,s2,s3,s4;
    s1=Math.pow(Math.pow((a1-b1),2)+Math.pow((a2-b2),2),0.5);
    s2=Math.pow(Math.pow((c1-b1),2)+Math.pow((c2-b2),2),0.5);
    s3=Math.pow(Math.pow((c1-a1),2)+Math.pow((c2-a2),2),0.5);
    s=(s1+s2+s3)/2;
    double area=Math.pow(s*(s-s1)*(s-s2)*(s-s3),0.5);
    System.out.println("The area of the triangle is "+(int)(area*10)/10.0);
    }//类型转换导致的编译错误//声明未使用的变量
}
