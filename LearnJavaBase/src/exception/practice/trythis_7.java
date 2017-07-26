package exception.practice;

public class trythis_7 {
	public void problem() throws Exception{
		throw new Exception("throw from problem");
	}
	
	public void trythis(){
		try{
			System.out.println("1");
			problem();
		}catch (RuntimeException x){
			System.out.println("2");
			return;
		}catch(Exception x){
			System.out.println("3");
			return;
		}finally{
			System.out.println("4");
		}
		System.out.println("5");
	}
	public static void main(String[] args) {
		trythis_7 t = new trythis_7();
		t.trythis();

	}

}
