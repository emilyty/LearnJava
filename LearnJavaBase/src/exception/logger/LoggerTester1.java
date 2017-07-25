package exception.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTester1 {

	public static void main(String[] args) {
		Logger myLogger = Logger.getLogger("mylogger");
		myLogger.setLevel(Level.WARNING);
		
		myLogger.info("这是一条普通消息");
		myLogger.warning("这是一条警告消息");
		myLogger.severe("这是一条严重错误信息");

	}

}
