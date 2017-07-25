package interFace;

public class Tester implements interfaceA{

	public static void main(String[] args) {
		Tester t = new Tester();
		t.method();
		t.method1();//Tester的实例可以直接访问接口中定义的method1()默认方法
		t.method3();
		//t.method2();//Tester实例不能访问interfaceA接口的静态方法
		interfaceA.method2();//可以通过接口名字来访问它的静态方法

	}

	@Override
	public void method() {
		System.out.println("method");
	}

	@Override
	public void method3() {
		System.out.println("method3");
	}
}
