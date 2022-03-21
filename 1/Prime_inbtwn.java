class Prime_inbtwn
{
 	public static void main(String args[])
	{
		int i,j,s_no=1,e_no=10;
		int flag;

		for(i=2;i<=e_no;i++)
		{
				
			flag = 0;

			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag++;
					break;
				}
			}		

			if(flag==0)
			{
				System.out.print(" "+i);
			}

		}
	}
			
}