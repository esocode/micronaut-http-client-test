package io.micronaut.test;

import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Maybe;

@Client("service")
public interface ServiceClient extends Service {

	// will only compile if method is duplicated
	//	@Override
	//	Maybe<Integer> getIdForName(@PathVariable String forName);
}
