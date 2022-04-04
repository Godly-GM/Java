
public class Static_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();
		Test obj2 = new Test();
//		obj2.max = 10;
//		obj.min = 3;
		System.out.println("Max is "+obj.max);
		System.out.println("Max is "+obj2.max);
		System.out.println("Max is "+Test.max);
		System.out.println("Min is "+obj.min);
	}

}


class Test{
	static int max=5;
	int min=2;
}
