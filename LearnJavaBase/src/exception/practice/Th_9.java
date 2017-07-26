package exception.practice;

import java.io.DataInputStream;
import java.io.IOException;

public class Th_9 {

	public static void main(String[] args) {
		Th_9 t = new Th_9();
		t.amethod();
	}
	public void amethod(){
		try{
			ioCall();
		}catch(IOException ioe){}
	}
	
	public void ioCall() throws IOException{
		DataInputStream din = new DataInputStream(System.in);
		din.readChar();
	}

}
