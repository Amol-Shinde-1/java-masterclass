class MyUnary{

	public static void main(String[] args){

		int x = 10;
		int a = x++ + ++x + --x;
		System.out.println(a); //33
		System.out.println(x); //11
	}
}
