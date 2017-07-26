package exception.assert1;

/**
 * assert表达式为false时，抛出AssertionError，这是一个错误，不是异常
 * 运行时，断言默认情况下是关闭的，这意味着程序中的断言语句不会被执行。在java命令行中启用断言需要使用-ea参数，禁用断言使用-da参数。例如： java -饿啊AssertTester
 * @author emilyty
 *
 */
public class AssertTester {
	
	public int divide(int a,int b){
		assert b!=0:"除数不允许为零";//使用断言
			return a/b;
	}

	public static void main(String[] args) {
		AssertTester t = new AssertTester();
		System.out.println(t.divide(2, 0));

	}

}
