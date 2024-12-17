package com.espinoza.denuncia_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espinoza.denuncia_service.entity.Denuncia;


public interface DenunciaRepository extends JpaRepository<Denuncia, Integer> {
	public Denuncia findByDni(String dni);
}
