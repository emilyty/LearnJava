package interFace.customizedservice;

public class Payment {
	public static final String TYPE_PER_YEAR="���긶��";
	public static final String TYPE_PER_MONTH="���¸���";
	
	private String type;//���ѷ���
	private double price;//�۸�
	public Payment(String type,double price){
		this.type=type;
		this.price=price;
	}
}
