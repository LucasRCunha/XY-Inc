package com.lucascunha.dev.services;

import java.util.ArrayList;
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

	public List<Poi> findAllNext(Integer x, Integer y, Integer dist) {
		List<Poi> list = repo.findAll();
		List<Poi> listFinal = new ArrayList<>();
		for(Poi p : list) {
			if(distance(p,x,y)<=dist)
				listFinal.add(p);
		}
		return listFinal;
	}

	private Double distance(Poi p, Integer x, Integer y) {
		return Math.sqrt(Math.pow((x-p.getCoordenada_x()),2)+Math.pow((y-p.getCoordenada_y()),2));
	}
	

}
