package extend.exercises;

import java.io.FileNotFoundException;

public class ExcepDemo extends Base{

	public static void main(String[] args) throws FileNotFoundException {
		ExcepDemo excepDemo = new ExcepDemo();
		excepDemo.amethod();

	}
	public static void amethod(){
		System.out.println("12");
	}//���ظ���ľ�̬����
	public ExcepDemo() throws FileNotFoundException{
		System.out.println("Pausing");
		//super.amethod();
		System.out.println("Continuing");
	}

}
