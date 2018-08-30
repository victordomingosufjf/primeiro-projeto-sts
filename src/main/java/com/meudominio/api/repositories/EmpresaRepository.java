package com.meudominio.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meudominio.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	Empresa findByCnpj(String cnpj);
}
