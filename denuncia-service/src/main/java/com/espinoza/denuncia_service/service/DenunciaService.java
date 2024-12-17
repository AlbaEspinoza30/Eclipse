package com.espinoza.denuncia_service.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.espinoza.denuncia_service.entity.Denuncia;


public interface DenunciaService {
	public List<Denuncia> findAll(Pageable page);
	public Denuncia findByDni(String dni);
	public Denuncia findById(int id);
	public Denuncia save(Denuncia obj);
	public boolean delete(int id);
}
