package exception.practice;

import java.io.DataInputStream;
import java.io.IOException;

public class ExcepDemo_2  extends Base_2{

	public static void main(String[] args) throws IOException {
		ExcepDemo_2 e = new ExcepDemo_2();

	}
	
	public static void amethod(){
		System.out.println("ExcepDemo_2");
	}
	
	protected ExcepDemo_2()throws IOException{
		DataInputStream din = new DataInputStream(System.in);
		System.out.println("Pausing");
		din.readChar();
		System.out.println("Continuing");
		this.amethod();
	}

}
