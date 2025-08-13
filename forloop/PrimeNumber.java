class PrimeNumber
{
    public static void main(String args[])
    {
        System.out.println("prime numbers between 1 and 50:");
	for(int i=1;i<=50;i++)
	{
	    if(isprime(i))
	    {
	        System.out.print(i + " ");
	    }
	}
    }
}
	    