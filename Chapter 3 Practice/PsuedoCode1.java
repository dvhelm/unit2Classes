import java.util.Scanner;
public class PsuedoCode1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the ten digit number here: ");
        String number = s.next();
        int x = number.length();
        String first3 = number.substring(0,x-7);
        String second3 = number.substring(3,x-4);
        String last4 = number.substring(6,x);
        String pnumber = "("+first3+") "+second3+" "+last4;
        System.out.print("The phone number is "+pnumber);
    }
}