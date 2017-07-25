package extend.polymorphic;

public class Sub extends Base{
	String var= "SubVar";//实例变量
	static String staticVar="StaticSubVar";//静态变量
	
	void method(){//覆盖父类的method方法
		System.out.println("Sub method");
	}
	
	static void staticMethod(){//隐藏父类的staticMethod()方法
		System.out.println("Static Sub method");
	}
	
	String subVar = "Var only belonging to sub";
	
	void subMehotd(){
		System.out.println("Method only belonging to Sub");
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Base who = new Sub();//who被声明为Base类型，引用Sub实例
		System.out.println("who.var="+who.var);//打印Base类的var变量
		System.out.println("who.staticVar="+who.staticVar);//打印Base类的staticVar变量
		who.method();//打印Sub实例的method（）方法
		who.staticMethod();//打印Base类的staticMethod()方法
		System.out.println("##########################################################################");
		Sub sub = new Sub();
		System.out.println("sub.var="+sub.var);//打印Base类的var变量
		System.out.println("sub.staticVar="+sub.staticVar);//打印Base类的staticVar变量
		sub.method();//打印Sub实例的method（）方法
		sub.staticMethod();//打印Base类的staticMethod()方法
		
		
	}

}
