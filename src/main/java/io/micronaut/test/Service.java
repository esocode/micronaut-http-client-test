package io.micronaut.test;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.reactivex.Maybe;

public interface Service {

	@Get(uri = "/get/id/{forName}")
	Maybe<Integer> getIdForName(@PathVariable String forName);
}
