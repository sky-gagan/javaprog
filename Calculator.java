class Calculator
{
	public static void main(String args[])
	{
	 int a = Integer.parseInt(args[0]);
	 int b = Integer.parseInt(args[1]);
	 int c = Integer.parseInt(args[2]);
	
         System.out.println(" Enter the two numbers and your choice i.e. 1 -- Add , 2 -- Subtratct ,3 -- Multiply,4 -- Division ");
	if(c == 1)
          System.out.println(a+b);
	if(c==2)
	  System.out.println(a-b);
	if(c==3)
	  System.out.println(a*b);
	if(c==4)
          
	   System.out.println(Float.parseFloat(args[0])/Float.parseFloat(args[1]));
	}
}
