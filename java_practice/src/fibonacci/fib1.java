package fibonacci;

public class fib1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 1;
		int c;
		for (int i = 0; i < 10; i++) {
			System.out.println(a);
			c = a+b;
			a=b;
			b=c;
		}
	}

}
