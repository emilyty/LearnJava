package extend.override;

public class Sub1 extends Base1{
	public String showMe(){//父类私有方法不能被子类覆盖
		return "Sub";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub1 sub1 = new Sub1();
		sub1.print();
	}

}
