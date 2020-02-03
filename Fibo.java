class Fibo
{
	public static void main(String args[])
	{
	 int n = Integer.parseInt(args[0]);
         int i = 0;
         int a = 0,b=1,c=0;
	 if(n==1)
	 System.out.println(a);
	 if(n>=2)
	{
	 System.out.println(a +"\n"+b);
        
	 for(i=0;i<n-2;i++)
	 {
	  c = a + b;
	  System.out.println(c);
	  a = b;
	  b = c;
	  }
	 }
	}
}
