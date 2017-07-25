package interFace.customizedservice;

public class BroadbandServiceImpl implements BroadbandService{
	int num;
	public BroadbandServiceImpl(int num){
		this.num=num;
	}

	@Override
	public void connect(String username,String password) {
		System.out.println(username+","+password);
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

}
