class SingleCatch
{
    public static void main(String args[])
    {
        double balance,interest;
        try
        {
            balance=Double.parseDouble(args[0]);
        }
        catch(Exception e)
        {
            System.out.println("invalid or no value received");
            balance=0.0;
        }
        
        interest=balance*0.03;
        System.out.println("interest is "+interest);

    }   
}