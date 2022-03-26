import java.util.*;

class Array_imple{

	public static void main(String args[]){
		
		int i,j; 
		int m[] = {31,534,123,123,1};
		int mm[][] = {
				{2,4,5},
				{4,5,7},
			     };
		System.out.println("\nOne dimensional array");
		for(i=0;i<m.length;i++){
			System.out.print(m[i]+" ");
		}
		System.out.println("\n\nTwo dimensional array");
		for(i=0;i<mm.length;i++){
			System.out.println();
			for(j=0;j<mm[i].length;j++){
				System.out.print(mm[i][j]+" ");
			}
		}
		
	}

}