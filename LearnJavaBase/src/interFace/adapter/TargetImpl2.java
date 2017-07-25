package interFace.adapter;

public class TargetImpl2 implements TargetIFC{
	private SourceIFC s;
	public TargetImpl2(SourceIFC s){ 
		this.s=s;
	}
	public int add(int a,int b){
		return s.add(b, b);
	}
	public int addOne(int a){
		return s.add(a, 1);
	}

}
