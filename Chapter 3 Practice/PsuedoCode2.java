import java.util.Scanner;
public class PsuedoCode2
{
    public static void main(String[] args)
    {
        System.out.print("Enter the price here(in cents): ");
        Scanner s = new Scanner(System.in);
        int price = s.nextInt();
        System.out.print("\nEnter the amount given here(in cents): ");
        int amtGiven = s.nextInt();
        int amtReturn = amtGiven-price;
        int amtDollar = amtReturn/100;
        System.out.print("\nAmount of dollars returned: "+amtDollar);
        amtReturn-=amtDollar*100;
        int amtQuarter = amtReturn/25;
        System.out.print("\nAmount of Quarters returned: "+amtQuarter);
        amtReturn-=amtQuarter*25;
        int amtDime = amtReturn/10;
        System.out.print("\nAmount of Dimes returned: "+amtDime);
        amtReturn-=amtDime*10;
        int amtNickel = amtReturn/5;
        System.out.print("\nAmount of Nickels returned: "+amtNickel);
        amtReturn-=amtNickel*5;
        int amtPenny = Math.round(amtReturn);
        System.out.print("\nAmount of Pennies returned: "+amtPenny);
    }
}