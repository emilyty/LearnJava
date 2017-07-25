package interFace;

public interface interfaceA {
	public int var1=1;
	public abstract void method();
	default void method1() {System.out.println("method1");}//声明一个默认方法
	static void method2(){System.out.println("method2");}//声明一个静态方法
	void method3();//声明抽象方法
	
}
