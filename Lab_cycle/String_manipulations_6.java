import java.util.Scanner;

public class String_manipulations_6 {
	
	public static void main(String[] args) {
			
		int ch,n;
		Boolean res=true;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("1.Create New String");
		System.out.println("2.Getting String length");
		System.out.println("3.String Concatination");
		System.out.println("4.Charactor Extraction");
		System.out.println("5.String Comparison");
		System.out.println("6.Searching Substring");
		System.out.println("7.Modifing String");
		System.out.println("8.Exit");
		
		while (res){
			System.out.println("\nENTER YOUR CHOICE:");
			ch=sn.nextInt();
			
			switch (ch) {
				
				case 1:
					System.out.println("\nEnter String: ");
					String str1 = new String();
					str1 = sn.nextLine();
					str1+= sn.nextLine();
					System.out.println("Entered String is: "+str1);
					break; 
					
				case 2: 
					System.out.println("\nEnter String: ");
					String str = new String();
					str = sn.nextLine();
					str+= sn.nextLine();
					int len = str.length();
					System.out.println("Length of String is: "+(len));
					break;
					
				case 3:
					System.out.println("Enter Your First name");
					String f_name=sn.next();
					System.out.println("Enter Your Last name");
					String l_name=sn.next();
					String wish=f_name.concat(" " + l_name);
					System.out.println("After concatination the String is:"+ wish);
					break;
					
				case 4:
					System.out.println("\nEnter String: ");
					String st = new String(sn.next());
					System.out.println("Enter an index");
					int i=sn.nextInt();
					char c = st.charAt(i);
					System.out.println("character at " + i + " is " + c);
					break;
					
				case 5:
					System.out.println("Enter Your First String");
					String s1=sn.next();
					System.out.println("Enter Your Second String");
					String s2=sn.next();
					if(s1.equals(s2)) {
						System.out.println("Both Strings are equal");
					}
					else {
						System.out.println("Strings are not equal");
					}
					break;
					
				case 6:
					System.out.println("Enter the String");
					String ss1=sn.next();
					System.out.println("Entered String is: " + ss1);
					System.out.println("Enter SubString");
					String ss2=sn.next();
					int index = ss1.indexOf(ss2);
//					int index1 = ss1.lastIndexOf(ss2);
					System.out.println("Substring " + ss2 + " is at index "+ index);
//					System.out.println("Substring " + ss2 + " is from last index "+ ss1.lastIndexOf(ss2));
					break;
					
				case 7:
					System.out.println("\nEnter String: ");
					String ss = new String();
					ss = sn.next();
					System.out.println("Entered String is: "+ss);
					
					System.out.println("Enter where to replace..");
					String re=sn.next();
					System.out.println("Enter word to replace..");
					String rep=sn.next();
					String replaced=ss.replace(re, rep);
					System.out.println("After replacing: "+replaced);
					break; 	
				case 8:
					res=false;
					break;
			}
		}	
	}
}
