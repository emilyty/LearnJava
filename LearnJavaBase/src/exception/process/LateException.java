package exception.process;

import java.util.Date;

public class LateException extends Exception{
	private Date arriveTime;
	private String reason;
	
	public LateException(Date arriveTime,String reason){
		this.arriveTime=arriveTime;
		this.reason=reason;
	}
	
	public Date getArriveTime(){
		return arriveTime;
	}
	public String getReason(){
		return reason;
	}
	
	void method(){
		try{
			//do something
		}catch(Throwable ex){
			//deal with Exception
			throw  ex;
		}
	}
}
