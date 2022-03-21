class Prime
{
 	public static void main(String args[])
	{
		int i,no=68;
		int flag = 0;
		if(no == 0||no==1)
		{
			System.out.println("Not prime Number");
		}
		else
		{
			for(i=2;i<=no/2;i++)
			{
				if(no%i==0)
				{
					//System.out.println("Not prime Number");
					flag = 0;
					break;
				}
				else
				{
					//System.out.println("Prime Number");
					flag = 1;
				}		
			}

			if(flag==1)
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Not prime Number");
			}
			
		}
			
	}
}