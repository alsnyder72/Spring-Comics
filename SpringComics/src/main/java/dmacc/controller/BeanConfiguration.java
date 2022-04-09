package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Comic;
import dmacc.beans.Condition;
import dmacc.beans.CustomerInfo;
import dmacc.beans.StorageInfo;

@Configuration
public class BeanConfiguration {

	@Bean
	public Comic comic() {
		Comic bean = new Comic();
		bean.setPublisher("Marvel");
		bean.setTitle("Spiderman");
		bean.setVolume(1);
		bean.setIssue(1);
		return bean;
	}
	
	@Bean
	public CustomerInfo customerInfo() {
		CustomerInfo bean = new CustomerInfo("John Smith", "123 Main St", "Metroplolis", "NY");
		return bean;
	}
	
	@Bean
	public StorageInfo storageInfo() {
		StorageInfo bean = new StorageInfo("M-A-01", false, "01-01-2020");
		return bean;
	}
	
	@Bean
	public Condition condition() {
		Condition bean = new Condition(4.0, "2020-01-01" );
		return bean;
	}
}
