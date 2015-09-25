public class MilkJarCalculator
{
    public static void main(String[] args)
    {
        double milk = 5.5; // gallons
        double jarCapacity = 0.75; // gallons
        double completelyFilledJars = milk / jarCapacity;
        //way 1
        System.out.print("Way 1\n");
        completelyFilledJars = (int) completelyFilledJars;
        System.out.println(completelyFilledJars);
        //way 2
        System.out.print("Way 2\n");
        int rounded = (int)Math.round(completelyFilledJars);
        System.out.println(rounded);
    }
}