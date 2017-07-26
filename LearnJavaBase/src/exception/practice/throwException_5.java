package exception.practice;

public class throwException_5 {
	public static void f() throws Exception{
		
	}
	
	public static void g()  {
		try {
			f();
		} catch (Exception e) {
			throw new NullPointerException("throw from g()");
		}
	}
	
	public static void k() throws Throwable{
		try {
			f();
		} catch (Exception e) {
			throw e.fillInStackTrace();
		}
	}
	
	public static void main(String []args){
		try {
				k();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
