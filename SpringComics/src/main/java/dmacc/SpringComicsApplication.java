package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Comic;
import dmacc.beans.Condition;
import dmacc.beans.StorageInfo;
import dmacc.beans.Customer;
import dmacc.beans.Address;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComicsRepository;
import dmacc.repository.CustomerRepository;


@SpringBootApplication
public class SpringComicsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringComicsApplication.class, args);
		// ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		//Comic co = appContext.getBean("comic", Comic.class);
		//System.out.println(co.toString());
	}
	
	/*
	@Autowired
	ComicsRepository comicRepo;
	
	@Autowired
	CustomerRepository customerRepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Comic c = appContext.getBean("comic", Comic.class);
		c.setPublisher("Marvel");
		comicRepo.save(c);
		
		//Creating a bean to use – not managed by Spring	
		Comic d = new Comic("Marvel", "Ironman", 1, 1);
		
		StorageInfo si = new StorageInfo("D-A-01", false, "2022-03-15");
		d.setStorage(si);
		
		Condition cn = new Condition(4.5, "2022-03-15");
		d.setCondition(cn);
		comicRepo.save(d);
			
		List<Comic> allMyComics = comicRepo.findAll();
		for(Comic book: allMyComics) {
			System.out.println(book.toString());
		}
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up.	
		((AbstractApplicationContext) appContext).close();
	}
	
	*/


	
}

