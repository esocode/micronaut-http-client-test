package io.micronaut.test;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ServiceBean {

	private final Integer id;

	@Inject
	public ServiceBean(Service service) {
		id = service.getIdForName("test").blockingGet();
	}

	public Integer getId() {
		return id;
	}
}