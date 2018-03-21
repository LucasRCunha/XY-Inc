package com.lucascunha.dev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucascunha.dev.domain.Poi;
import com.lucascunha.dev.repositories.PoiRepository;

@Service
public class PoiService {
	
	@Autowired
	private PoiRepository repo;
	
	public List<Poi> findAll() {
		return repo.findAll();
	}
	
	public Poi insert(Poi obj) {
		obj.setId(null);
		return repo.save(obj);
	}
}
