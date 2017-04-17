package com.restfuljersey.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.ui.Model;

import com.restfuljersey.entity.Pessoa;
import com.restfuljersey.repository.PessoaRepository;

@Path("/pessoas")
public class PessoaController {
	@Autowired
	private PessoaRepository pessoaRepository;
		
	@GET
	@Path("/listarPessoas")
    @Produces(MediaType.APPLICATION_JSON)
	public List<Pessoa> listaPessoas(){
		return pessoaRepository.findAll();
    }
	
	@GET
	@Path("/listarPessoasPorId")
    @Produces(MediaType.APPLICATION_JSON)
	public Response listaPessoasPorID(@QueryParam("idPessoa") Integer idPessoa){
		List<Pessoa> listaPessoas = pessoaRepository.findAll();
		
		return Response.ok(listaPessoas).build();
    }  
}
