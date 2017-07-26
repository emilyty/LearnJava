package exception.practice;

public class Rethrow_4 {
	public static void g() throws Exception{
		System.out.println("Originates from g()");
		throw new Exception("throen from g()");
	}
	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			System.out.println("Caught in main");
			e.printStackTrace();
			throw new NullPointerException("from main");
		}

	}

}
