package exception.process;

public class ExTester {
	@SuppressWarnings({ "finally", "unused" })
	public void show() throws Exception{
		Exception myException=null;
		try{
			Integer.parseInt("Hello");
		}catch(NumberFormatException e1){
			myException=e1;
			//throw new Exception("��Ч������",e1);
		} finally{
			try{
				int result =2/0;
			}catch(ArithmeticException e2){
				if(myException==null)
					myException=e2;
				else
					myException.addSuppressed(e2);
				//throw new Exception("��ѧ�������",e2);
			}
			throw myException;
		}
	}
	
	
	public static void main(String[] args)throws Exception{
		ExTester t = new ExTester();
		try{
			t.show();
			}catch(Exception ex){
				System.out.println("��ǰ�쳣��Ϣ��"+ex.getMessage());
				ex.printStackTrace();
				Throwable[] exs=ex.getSuppressed();
				for(Throwable e:exs)
					System.out.println("��㶪ʧ���쳣��Ϣ��"+e.getMessage());
			}
		
	}
}
