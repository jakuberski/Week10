package store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import store.beans.Address;
import store.beans.Store;
import store.controller.BeanConfiguration;
import store.repository.StoreRepository;

@SpringBootApplication
public class StoreAddressesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreAddressesApplication.class, args);
	}
	
	/*@Autowired
	StoreRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		// Using an existing bean
		Store c = appContext.getBean("store", Store.class);
		c.setZipCode(50021);
		repo.save(c);

		// Create a bean to use - not managed by Spring
		Store d = new Store("Hy-Vee", "555-555-5556", 50021);
		Address a = new Address("123 Main Street", "Des Moines", "IA");
		d.setAddress(a);
		repo.save(d);

		List<Store> allMyStore = repo.findAll();
		for (Store people : allMyStore) {
			System.out.println(people.toString());
		}

		((AbstractApplicationContext) appContext).close();

	}*/

}