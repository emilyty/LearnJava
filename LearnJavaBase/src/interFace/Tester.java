package interFace;

public class Tester implements interfaceA{

	public static void main(String[] args) {
		Tester t = new Tester();
		t.method();
		t.method1();//Tester��ʵ������ֱ�ӷ��ʽӿ��ж����method1()Ĭ�Ϸ���
		t.method3();
		//t.method2();//Testerʵ�����ܷ���interfaceA�ӿڵľ�̬����
		interfaceA.method2();//����ͨ���ӿ��������������ľ�̬����

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
