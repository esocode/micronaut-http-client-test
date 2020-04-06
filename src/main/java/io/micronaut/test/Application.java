package io.micronaut.test;

import java.net.MalformedURLException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import io.micronaut.context.annotation.Context;
import io.micronaut.runtime.Micronaut;

@Context
public class Application {

    @Inject
    private ServiceBean serviceBean;

    public static void main(final String[] args) {
        Micronaut.run(Application.class);
    }

    @PostConstruct
    void runApp() throws MalformedURLException {
        System.out.println(
            "*********************************************************");
        System.out.println("ID of 'test': " + serviceBean.getId());
    }
}