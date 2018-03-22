package com.lucascunha.dev.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lucascunha.dev.domain.Poi;
import com.lucascunha.dev.services.PoiService;

@RestController
@RequestMapping(value="/poi")
public class PoiResource {
	
	@Autowired
	private PoiService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Poi>> findAll() {
		List<Poi> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody Poi obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	@RequestMapping(value="/{next}", method=RequestMethod.GET)
	public ResponseEntity<List<Poi>> findAllNext(@RequestParam(value="x", defaultValue="0") Integer x,
			@RequestParam(value="y", defaultValue="0") Integer y,
			@RequestParam(value="distance", defaultValue="0") Integer dist) {
		List<Poi> list=service.findAllNext(x,y,dist);
		return ResponseEntity.ok().body(list);
	}
}
