public class DistanceConverter
{
    public static final double YARDS = 3.5;
    public static final double YD_TO_FT = 3;
    public static final double FT_TO_IN = 12;
    public static final double FEET = YARDS * YD_TO_FT;
    public static final double INCHES = FEET * FT_TO_IN;

    public static void main(String[] args)
    {

        System.out.println(YARDS + " yards are " + FEET + " feet");
        System.out.println(YARDS + " yards are " + INCHES + " inches");
    }
}