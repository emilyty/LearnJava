package extend;

public class Sub extends Base{
	public void methodOfSub(){
		publicVarOfBase = 2;
		defaultVarOfBase = 2;
		//privateVarOfBase = 2;//不合法
		methodOfBase();
		System.out.println("b:"+publicVarOfBase+","+defaultVarOfBase);
	}
	
	public static void main(String args[]){
		Sub sub = new Sub();
		sub.publicVarOfBase = 3;
		sub.defaultVarOfBase = 3;
		//sub.privateVarOfBase = 3;//不合法
		System.out.println("a:"+sub.publicVarOfBase+","+sub.defaultVarOfBase);
		
		sub.methodOfBase();
		sub.methodOfSub();
	}

}
