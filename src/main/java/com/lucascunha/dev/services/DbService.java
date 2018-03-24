package com.lucascunha.dev.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucascunha.dev.domain.Poi;
import com.lucascunha.dev.repositories.PoiRepository;

@Service
public class DbService {

	
	@Autowired
	private PoiRepository poiReposioty;
	
	public void instantiateTestDataBase() throws ParseException {
		Poi p1= new Poi(null,"Lanchonete",27,12);
		Poi p2= new Poi(null,"Posto",31,18);
		Poi p3= new Poi(null,"Joalheria",15,12);
		Poi p4= new Poi(null,"Floricultura",19,21);
		Poi p5= new Poi(null,"Pub",12,8);
		Poi p6= new Poi(null,"Supermercado",23,6);
		Poi p7= new Poi(null,"Churrascaria",28,2);
		
		poiReposioty.save(Arrays.asList(p1,p2,p3,p4,p5,p6,p7));

	}
}
