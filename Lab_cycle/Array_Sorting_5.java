import java.util.*;
import java.util.Arrays;

	public class Array_Sorting_5 {

		public static void main(String[] args) {
			int ch,n;
			boolean b=true;
			Scanner sc=new Scanner(System.in);
			
			n=2;
			String a[]=new String[n];
			
			System.out.println("1.Insert to Array");
			System.out.println("2.Sort with function");
			System.out.println("3.Sort");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			
			while(b) {
				System.out.println("\nENTER YOUR CHOICE:");
				ch=sc.nextInt();
				
				switch(ch) {
				case 1:
					System.out.println("Enter the limit of Array");
					n=sc.nextInt();
					a=new String[n];
					System.out.println("Enter Strings to Array");
					for(int i=0;i<n;i++) {
						a[i]=sc.next();
					}
					break;
					
				case 2:
					System.out.println("\nSorting with Sort Method");
					Arrays.sort(a);
					System.out.println(Arrays.toString(a));
					break;
					
				case 3:
					System.out.println("\nNormal Sorting");
					for(int i=0;i<n-1;i++) {
						for(int j=i+1;j<n;j++) {
							if(a[i].compareTo(a[j])>0) {
								String temp=a[i];
								a[i]=a[j];
								a[j]=temp;
							}
						}
					}
					System.out.println(Arrays.toString(a));
					break;
					
				case 4:
					System.out.println(Arrays.toString(a));
					break;
					
				case 5:
					b=false;
					break;
				}
			}

		}

	}