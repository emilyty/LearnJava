package extend.exercises;

import extend.Base;
import extend.Sub;

public class sub extends Base{
	public void methodOfSub(){
		publicVarOfBase = 2;
	//	defaultVarOfBase = 2;
		//privateVarOfBase = 2;//���Ϸ�
		methodOfBase();
		System.out.println("b:"+publicVarOfBase);
	}
	
	public static void main(String args[]){
		sub sub1 = new sub();
		sub1.publicVarOfBase = 3;
		//sub1.defaultVarOfBase = 3;
		//sub.privateVarOfBase = 3;//���Ϸ�
		System.out.println("a:"+sub1.publicVarOfBase);
		
		sub1.methodOfBase();
		sub1.methodOfSub();
	}

}