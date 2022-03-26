import java.util.*;

class Grade_multiple
{
	public static void main(String args[])
     	{ 
		char [][] test= {
                        {'D','B','A','C','B'},
                        {'A','B','C','A','A'},
                        {'B','B','C','A','B'},
                        {'D','D','A','C','B'},
                        {'D','C','B','A','A'}
                        };

       		char key[]={'D','C','B','A','B'}; 
       		int i,j;
       		int crt=0;
		
		for(i=0;i<test.length;i++)
		{
			for(j=0;j<test[i].length;j++)
			{
				if(test[i][j] == key[j])
				{
					crt = crt+1;
				}
			}
			System.out.println("Score of Std: "+(i+1)+" is "+crt);
			crt = 0;
		}		
      
    	}
}
