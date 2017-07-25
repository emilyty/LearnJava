package interFace.customizedservice;

public class Payment {
	public static final String TYPE_PER_YEAR="按年付费";
	public static final String TYPE_PER_MONTH="按月付费";
	
	private String type;//付费方法
	private double price;//价格
	public Payment(String type,double price){
		this.type=type;
		this.price=price;
	}
}
