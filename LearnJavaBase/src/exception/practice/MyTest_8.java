package exception.practice;

public class MyTest_8 {
	public void foo(){
		try {
			bar();
		} catch (MyException_8 e) {
			e.printStackTrace();
		}finally{
			baz();
		}
	}
	
	private void bar() throws MyException_8 {
		throw new MyException_8();
		
	}
	private void baz() {
		throw new RuntimeException();
		
	}

}
