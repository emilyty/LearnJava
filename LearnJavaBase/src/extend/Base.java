package extend;

public class Base {
	public int publicVarOfBase = 1;
	private int privateVarOfBase = 1;
	int defaultVarOfBase = 1; //Ĭ�Ϸ��ʼ���
	protected void methodOfBase(){
		System.out.println("c:"+publicVarOfBase+","+defaultVarOfBase+","+privateVarOfBase);
	}

}
