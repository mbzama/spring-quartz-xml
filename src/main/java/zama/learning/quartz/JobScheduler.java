package zama.learning.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.QuartzJobBean;

@Configuration
public class JobScheduler extends QuartzJobBean {
	private SendEmailTask sendEmailTask;

	public void setSendEmailTask(SendEmailTask sendEmailTask) {
		this.sendEmailTask = sendEmailTask;
	}

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		sendEmailTask.sendEmail();
	}
}
