package extend.polymorphic;

public class Sub extends Base{
	String var= "SubVar";//ʵ������
	static String staticVar="StaticSubVar";//��̬����
	
	void method(){//���Ǹ����method����
		System.out.println("Sub method");
	}
	
	static void staticMethod(){//���ظ����staticMethod()����
		System.out.println("Static Sub method");
	}
	
	String subVar = "Var only belonging to sub";
	
	void subMehotd(){
		System.out.println("Method only belonging to Sub");
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Base who = new Sub();//who������ΪBase���ͣ�����Subʵ��
		System.out.println("who.var="+who.var);//��ӡBase���var����
		System.out.println("who.staticVar="+who.staticVar);//��ӡBase���staticVar����
		who.method();//��ӡSubʵ����method��������
		who.staticMethod();//��ӡBase���staticMethod()����
		System.out.println("##########################################################################");
		Sub sub = new Sub();
		System.out.println("sub.var="+sub.var);//��ӡBase���var����
		System.out.println("sub.staticVar="+sub.staticVar);//��ӡBase���staticVar����
		sub.method();//��ӡSubʵ����method��������
		sub.staticMethod();//��ӡBase���staticMethod()����
		
		
	}

}
