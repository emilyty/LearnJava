package extend.polymorphic;

public class Base {
	String var = "BaseVar";//实例变量
	static String staticVar = "StaticBaseVar";
	
	void method(){//实例方法
		System.out.println("Base method");
	}
	static void staticMethod(){//静态方法
		System.out.println("Static Base method");
	}

}
