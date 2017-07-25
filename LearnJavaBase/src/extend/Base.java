package extend;

public class Base {
	public int publicVarOfBase = 1;
	private int privateVarOfBase = 1;
	int defaultVarOfBase = 1; //默认访问级别
	protected void methodOfBase(){
		System.out.println("c:"+publicVarOfBase+","+defaultVarOfBase+","+privateVarOfBase);
	}

}
