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
	public void mehtodA(){
		method2();
		System.out.println("methodA");
	}
	//Creating a new branch is quick and simple.
}
