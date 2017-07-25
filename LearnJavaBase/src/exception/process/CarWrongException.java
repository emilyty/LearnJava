package exception.process;

public class CarWrongException extends Exception{
	public CarWrongException(){}
	public CarWrongException(String msg){
		super(msg);
	}
}
