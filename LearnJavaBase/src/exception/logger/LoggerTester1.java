package exception.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTester1 {

	public static void main(String[] args) {
		Logger myLogger = Logger.getLogger("mylogger");
		myLogger.setLevel(Level.WARNING);
		
		myLogger.info("����һ����ͨ��Ϣ");
		myLogger.warning("����һ��������Ϣ");
		myLogger.severe("����һ�����ش�����Ϣ");

	}

}
