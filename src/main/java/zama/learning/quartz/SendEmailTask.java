package zama.learning.quartz;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SendEmailTask {
	private static final Logger log = LoggerFactory.getLogger(SendEmailTask.class.getName());
	
	public void sendEmail() {
		System.out.println("Sending email at "+ Calendar.getInstance().getTime());
		log.info("Sending email at "+ Calendar.getInstance().getTime());
	}
}
