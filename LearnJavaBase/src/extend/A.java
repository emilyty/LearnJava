package extend;

public class A {
	private C c;
	public A(C c){
		this.c=c;
	}
	private void method2(){
		System.out.println("method2");
	}
	public void method3(){
		c.method3();
	}
	public void methodA(){
		method2();
		System.out.println("methodA");
		System.out.println("methodA test");
	}
	public void test(){
		System.out.println("test");
	}
}
