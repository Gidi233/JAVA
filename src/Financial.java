import java.util.Scanner;
public class Financial  {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name:");
        String name=input.next();
        System.out.println("Enter number of hours worked in a week:");
        int hour=input.nextInt();
        System.out.println("Enter hourly pay rate:");
        float payrate=input.nextFloat();
        System.out.println("Enter federal tax withholding rate:");
        float Frate=input.nextFloat();
        System.out.println("Enter state tax withholding rate: ");
        float Srate=input.nextFloat();
        System.out.println("employee name:"+name);
        System.out.println("Hours Worked: "+hour);
        System.out.println("Pay Rate:"+payrate);
        System.out.println("Gross Pay:"+hour*payrate);
        System.out.println("Deductions:");
        System.out.println("Federal Withholding :"+hour*payrate*Frate);
        System.out.println("State Withholding : "+hour*payrate*Srate);
        System.out.println("Total Deduction:"+hour*payrate*(Frate+Srate));
        System.out.println("Net Pay:"+hour*payrate*(1-Frate-Srate));
        }
}
