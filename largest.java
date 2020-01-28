class Largest
{
	public static void main(String args[])
	{
	  int d;
         int a = Integer.parseInt(args[0]);
         int b = Integer.parseInt(args[1]);
	 int c = Integer.parseInt(args[2]);
 	 if(a > b  && a > c)
	  {
	    d = a;
	  }
	 else if(b > a && b > c)
	  {
	    d = b;
	   }
	 else
	 {
	    d = c;
	 }
	 System.out.println("Largest number = "+d);
	}
}
