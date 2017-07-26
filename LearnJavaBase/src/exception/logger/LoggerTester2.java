package exception.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTester2 {

	public static void main(String[] args) throws SecurityException, IOException {
		Logger myLogger = Logger.getLogger("mylogger");

		/**
		 * Ĭ������£�logger����־���������̨����concoleHandler�������
		 * ���Ҫ����־������ļ��У����Բ�������ķ���
		 */
		FileHandler fileHandler = new FileHandler("C:\\test.log");
		fileHandler.setLevel(Level.INFO);//�趨�ļ���д��־�ļ���
		myLogger.addHandler(fileHandler);//��FileHandler��logger�������
		
		myLogger.info("����һ����ͨ��Ϣ");
		myLogger.warning("����һ��������Ϣ");
		myLogger.severe("����һ�����ش�����Ϣ");

	}

}
