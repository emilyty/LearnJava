package extend.exercises;

public class Abs_11 extends Base_11{

	public static void main(String[] args) {
		Abs_11 abs = new Abs_11();
		abs.amethod();


	}
	public void myfunc(){
		System.out.println("my func");
	}
	public void amethod(){
		myfunc();
	}

}
