package exception.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;


//设置日志的输出格式
/**
 * 默认情况下，concoleHandler类与SimpleFormatter类关联，也就是说，向控制台蔬菜的日志采用普通的格式。
 * FileHandler类与XMLFormatter类关联，也就是说，想文件中输出的日志是基于xml格式的。
 * 可以自定义一个集成Formatter类的子类，然后覆盖他的format方法。
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
		myLogger.info("这是一条普通消息");
		myLogger.warning("这是一条警告信息");
	}
	

}
