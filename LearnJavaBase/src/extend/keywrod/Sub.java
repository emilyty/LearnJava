package extend.keywrod;

public class Sub extends Base{
	String var = "Sub's variable";
	void method(){
		System.out.println("call Sub' method");
	}
	
	void test(){
		String var = "Local variable";
		
		System.out.println("var is"+var);
		System.out.println("this.var is "+this.var);
		System.out.println("super.var is "+super.var);
		
		method();
		this.method();
		super.method();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		sub.test();

	}

}
