package com.economizamais.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.economizamais.domain.Loja;
import com.economizamais.dto.LojaDTO;
import com.economizamais.dto.PrecoDTO;
import com.economizamais.services.LojaService;

@CrossOrigin
@RestController
@RequestMapping(value="/lojas")
public class LojaResource {
	
	@Autowired
	private LojaService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<LojaDTO>> buscarTodos() {
		List<Loja> list = service.findAll();
		List<LojaDTO> listDto = list.stream().map(x -> new LojaDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> buscarId(@PathVariable Integer id) {
		Loja entity = service.findById(id);
		LojaDTO entityDto = new LojaDTO(entity); 
		return ResponseEntity.ok().body(entityDto);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> inserir(@RequestBody Loja entity) {
		entity = service.save(entity);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
		
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Loja entity, @PathVariable Integer id) {
		entity.setId(id);
		service.update(entity);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> excluir(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
