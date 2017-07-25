package extend.override;

public class Sub extends Base{
	void method(){//覆盖父类的实例方法
		System.out.println("method of Sub");
	}
	static void staticMethod(){//隐藏父类的静态方法
		System.out.println("static method of sub");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base sub1 = new Sub();//sub1 变量被生命为Base类型，应用Sub实例
		sub1.method();
		sub1.staticMethod();
		
		Sub sub2 = new Sub();//sub2变量被声明为Sub类型，引用sub实例
		sub2.method();
		sub2.staticMethod();
		
		Base sub3 = new Base();
		sub3.method();
		sub3.staticMethod();

	}

}
