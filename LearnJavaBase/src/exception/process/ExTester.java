package exception.process;

public class ExTester {
	@SuppressWarnings({ "finally", "unused" })
	public void show() throws Exception{
		Exception myException=null;
		try{
			Integer.parseInt("Hello");
		}catch(NumberFormatException e1){
			myException=e1;
			//throw new Exception("无效的数字",e1);
		} finally{
			try{
				int result =2/0;
			}catch(ArithmeticException e2){
				if(myException==null)
					myException=e2;
				else
					myException.addSuppressed(e2);
				//throw new Exception("数学运算出错",e2);
			}
			throw myException;
		}
	}
	
	
	public static void main(String[] args)throws Exception{
		ExTester t = new ExTester();
		try{
			t.show();
			}catch(Exception ex){
				System.out.println("当前异常信息："+ex.getMessage());
				ex.printStackTrace();
				Throwable[] exs=ex.getSuppressed();
				for(Throwable e:exs)
					System.out.println("差点丢失的异常信息："+e.getMessage());
			}
		
	}
}
