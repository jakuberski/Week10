package store.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import store.beans.Address;
import store.beans.Store;

@Configuration
public class BeanConfiguration {
@Bean
	public Store store() {
	Store bean = new Store("FareWay");
	//bean.setName("Hy-Vee");
	//bean.setPhone("555-555-5555");
	//bean.setZipCode(50021);
	
	return bean;
}

@Bean
public Address address() {
	Address bean = new Address("123 Main Street", "Des Moines", "IA");
			return bean;
}

}
