package exception.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTester2 {

	public static void main(String[] args) throws SecurityException, IOException {
		Logger myLogger = Logger.getLogger("mylogger");

		/**
		 * 默认情况下，logger把日志输出到控制台，与concoleHandler对象关联
		 * 如果要把日志输出到文件中，可以采用下面的方法
		 */
		FileHandler fileHandler = new FileHandler("C:\\test.log");
		fileHandler.setLevel(Level.INFO);//设定文件中写日志的级别
		myLogger.addHandler(fileHandler);//把FileHandler与logger对象关联
		
		myLogger.info("这是一条普通消息");
		myLogger.warning("这是一条警告消息");
		myLogger.severe("这是一条严重错误信息");

	}

}
