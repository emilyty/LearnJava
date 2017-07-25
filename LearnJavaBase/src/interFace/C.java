package interFace;

public interface C extends A,B{//接口C是复合接口，如果要实现C接口必须也要实现AB的抽象方法 
	void methodC();
}
