import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double base, height;
        System.out.print("Enter the bases length: ");
        base = s.nextDouble();
        System.out.print("Enter the Height: ");
        height = s.nextDouble();
        //area
        double area = base*height;
        //perimeter
        double perimeter = base+base+height+height;
        //diagonal
        double ab = Math.pow(base,2)+Math.pow(height,2);
        double diagonal = Math.sqrt(ab);
        System.out.print("The area of the rectangle is: "+area+"\n The perimeter of rectangle is: "+ perimeter +"\n The diagonal length of the rectangle is: "+diagonal);
    }
}