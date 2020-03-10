package io.micronaut.test;

import io.micronaut.http.client.annotation.Client;

@Client("service")
public interface ServiceClient extends Service {
}
