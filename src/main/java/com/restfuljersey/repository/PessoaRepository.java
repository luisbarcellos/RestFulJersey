package com.restfuljersey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restfuljersey.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
	List<Pessoa> findAll();
}
