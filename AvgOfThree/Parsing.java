import java.util.Scanner;
public class Parsing
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print ("Enter a number between 1000 and 999,999: ");
        String number = s.next();
        int x = number.length();
        String sub = number.substring(0,3);
        String sub2 = number.substring(x-3,x);
        String newNumber = sub+sub2;
        System.out.print("The number is : "+newNumber);
    }
}