import java.util.Scanner;
public class PsuedoCode2
{
    public static void main(String[] args)
    {
        System.out.print("Enter the price here: ");
        Scanner s = new Scanner(System.in);
        String price = s.next();
        int x = price.length();
        String dollar = price.substring(0,x-3);
        String cents = price.substring(x-2,x);
        System.out.print("The amount of dollar(s) in the price is "+dollar+" and the amount of cent(s) in the price is "+cents);
    }
}