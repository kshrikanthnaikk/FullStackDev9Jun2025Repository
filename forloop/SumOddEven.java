class SumOddEven
{
    public static void main(String args[])
    {
	int sume=0,sumo=0;
	for(int i=1;i<=100;i++)
	{
	    if(i%2==0)
	    {
	        sume=sume+i;
	    }
	    else
	    {
	        sumo=sumo+i;
	    }
	}System.out.println(sume);
	 System.out.println(sumo);
    }
}
	    