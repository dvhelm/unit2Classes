public class Annuity
{
    public static void main (String[] args)
    {
        double i = .08;
        double n = 20;
        double PVann = 10000;
        double x = 1;
        double upper = x+i;
        double exponent= Math.pow (upper, n-x);
        double upper2= exponent-x;
        double uppert = upper2/i;
        double lower= x+i;
        double lexponent = Math.pow(lower,n-x);
        double stotal = uppert/lexponent;
        double total = stotal+1;
        double PMT = PVann/ total;
        System.out.println(PMT);
    }
}