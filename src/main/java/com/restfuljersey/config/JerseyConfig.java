package com.restfuljersey.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.restfuljersey.controller.PessoaController;

@Component
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig(){
		super();
		register(PessoaController.class);
	}
}
