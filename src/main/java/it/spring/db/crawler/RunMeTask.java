package it.spring.db.crawler;

import it.spring.db.crawler.configuration.ApplicationSetup;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class RunMeTask {
	
	
	@Resource
	private  ApplicationSetup applicationSetup;
	
	
	public void printMe() {
		
		System.out.println(applicationSetup.toString());
	}
}