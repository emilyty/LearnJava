package interFace;

public interface interfaceA {
	public int var1=1;
	public abstract void method();
	default void method1() {System.out.println("method1");}//����һ��Ĭ�Ϸ���
	static void method2(){System.out.println("method2");}//����һ����̬����
	void method3();//�������󷽷�
	
}
