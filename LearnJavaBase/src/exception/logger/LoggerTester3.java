package exception.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;


//������־�������ʽ
/**
 * Ĭ������£�concoleHandler����SimpleFormatter�������Ҳ����˵�������̨�߲˵���־������ͨ�ĸ�ʽ��
 * FileHandler����XMLFormatter�������Ҳ����˵�����ļ����������־�ǻ���xml��ʽ�ġ�
 * �����Զ���һ������Formatter������࣬Ȼ�󸲸�����format������
 */
public class LoggerTester3 {
	static class MyFormatter extends Formatter{

		@Override
		public String format(LogRecord record) {
			return "<"+record.getLevel()+">"+record.getMessage()+"\n";
		}
	}
		
	public static void main(String[] args) throws SecurityException, IOException{

		Logger myLogger = Logger.getLogger("myLogger");
		
		FileHandler fileHandler = new FileHandler("C:\\test.log");
		fileHandler.setFormatter(new MyFormatter());
		myLogger.addHandler(fileHandler);
		myLogger.info("����һ����ͨ��Ϣ");
		myLogger.warning("����һ��������Ϣ");
	}
	

}
