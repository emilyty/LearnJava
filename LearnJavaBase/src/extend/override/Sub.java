package extend.override;

public class Sub extends Base{
	void method(){//���Ǹ����ʵ������
		System.out.println("method of Sub");
	}
	static void staticMethod(){//���ظ���ľ�̬����
		System.out.println("static method of sub");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base sub1 = new Sub();//sub1 ����������ΪBase���ͣ�Ӧ��Subʵ��
		sub1.method();
		sub1.staticMethod();
		
		Sub sub2 = new Sub();//sub2����������ΪSub���ͣ�����subʵ��
		sub2.method();
		sub2.staticMethod();
		
		Base sub3 = new Base();
		sub3.method();
		sub3.staticMethod();

	}

}
