package com.mkyoung.model;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.service.RepositoryService;

public class ApiModel {

	public String getNome(String nome) throws IOException{
		
		RepositoryService service = new RepositoryService();
		
		List<Repository> lista = service.getRepositories(nome);
		
		return lista.get(0).getName();
	}

}