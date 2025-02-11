class Errors
{
    public static void main(String args[])
    {
        double balance,interest;
        try
        {
            balance=Double.parseDouble(args[0]);
        }
        catch(NumberFormatException e)
        {
            System.out.println("invalid...pass a numeric value for balance");
            balance=0.0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("no value received..pass some balance");
            balance=0.0;
        }
        interest=balance*0.03;
        System.out.println("interest is "+interest);

    }   
}