package extend.override;

public class Sub1 extends Base1{
	public String showMe(){//����˽�з������ܱ����า��
		return "Sub";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub1 sub1 = new Sub1();
		sub1.print();
	}

}
