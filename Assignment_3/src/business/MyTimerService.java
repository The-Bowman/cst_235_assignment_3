package business;

import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;

@Stateless
public class MyTimerService {
	
	@Resource
	TimerService timerservice;
	
	private static final Logger logger = Logger.getLogger("business.TimerService");
	
	public MyTimerService() {
		
	}
	
	public void setTimer(long interval) {
		timerservice.createTimer(interval, "Setting a programmatic timer");
	}
	
	@Timeout
	public void programmmaticTimeout(Timer timer) {
		logger.info("@Timeout in programmatic timer at " + new java.util.Date());
	}
	
	@Schedule(second="*/10", minute="*", hour="0-23", dayOfWeek="*", dayOfMonth="*", month="*", year="*", info="MyTimer")
	private void scheduleTimeout(final Timer t) {
		logger.info("@Scheduled timer triggered at " + new java.util.Date());
	}
}
