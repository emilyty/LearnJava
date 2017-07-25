package interFace.adapter;

public class TargetIFCImpl extends SousceIFCImpl implements TargetIFC{

	@Override
	public int addOne(int a) {
		return add(a,1);
	}



}
