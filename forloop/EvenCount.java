class EvenCount
{
    public static void main(String args[])
    {
	int even=0;
	for(int i=1000;i>=500;i--)
	{
	    if(i%2==0)
	    {
	        even=even+1;
	    }
	}
	System.out.println(even);
    }
}