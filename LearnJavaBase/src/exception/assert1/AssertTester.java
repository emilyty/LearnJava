package exception.assert1;

/**
 * assert���ʽΪfalseʱ���׳�AssertionError������һ�����󣬲����쳣
 * ����ʱ������Ĭ��������ǹرյģ�����ζ�ų����еĶ�����䲻�ᱻִ�С���java�����������ö�����Ҫʹ��-ea���������ö���ʹ��-da���������磺 java -����AssertTester
 * @author emilyty
 *
 */
public class AssertTester {
	
	public int divide(int a,int b){
		assert b!=0:"����������Ϊ��";//ʹ�ö���
			return a/b;
	}

	public static void main(String[] args) {
		AssertTester t = new AssertTester();
		System.out.println(t.divide(2, 0));

	}

}
