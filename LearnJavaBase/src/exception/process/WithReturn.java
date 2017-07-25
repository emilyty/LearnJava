package exception.process;

public class WithReturn {
	public int methodA(int money) throws SpecialException{
		if(-money<=0) throw new SpecialException("Out of money");
		return money;
	}
	
	public int methodB(int money){
		try {
			System.out.println("Begin");
			int result = methodA(money);
			return result;
		} catch (SpecialException e) {
			System.out.println(e.getMessage());
			return -100;
		} finally{
			System.out.println("Finally");
		}

	}
	
	public static void main(String args[]){
		System.out.println(new WithReturn().methodB(1));
	}
}
