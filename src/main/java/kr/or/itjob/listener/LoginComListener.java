package kr.or.itjob.listener;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.itjob.model.ItJobComVo;
import kr.or.itjob.model.ItJobUserVo;

public class LoginComListener implements HttpSessionAttributeListener{
	private static final Logger logger = LoggerFactory.getLogger(LoginComListener.class);
	
	private Set<String> coms = new HashSet<>();
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		
		if(event.getName().equals("S_COM")) {
			ItJobComVo com =  (ItJobComVo)event.getValue();
			logger.debug("added user : {}",com.getCom_id());
			coms.add(com.getCom_id());
			
			 event.getSession().getServletContext().setAttribute("USER_SET", com);
		}
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		ItJobComVo com =  (ItJobComVo)event.getValue();
		logger.debug("removed user : {}",com.getCom_id());
		
		
		coms.remove(com.getCom_id());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		
	}
	
	
	
	
	
}
