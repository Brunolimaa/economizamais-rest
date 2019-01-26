package com.economizamais.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collector;
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

import com.economizamais.domain.Preco;
import com.economizamais.dto.PrecoDTO;
import com.economizamais.services.PrecoService;

@CrossOrigin
@RestController
@RequestMapping(value="/precos")
public class PrecoResource {
	
	@Autowired
	private PrecoService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<PrecoDTO>> buscarTodos() {
		List<Preco> list = service.findAll();
		List<PrecoDTO> listDto = list.stream().map(x -> new PrecoDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);

	}
	
	@RequestMapping(value="/app", method=RequestMethod.GET)
	public ResponseEntity<List<PrecoDTO>> buscarTodosApp(){
		List<Preco> list = service.findAllApp();
		List<PrecoDTO> listDto = list.stream().map(x -> new PrecoDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> buscarId(@PathVariable Integer id){
		Preco obj = service.findById(id);
		PrecoDTO entityDto = new PrecoDTO(obj);
		return ResponseEntity.ok().body(entityDto);
	}
	
	@RequestMapping(value="/loja/{id}", method=RequestMethod.GET)
	public ResponseEntity<List<PrecoDTO>> buscarIdLoja(@PathVariable Integer id) {
		List<Preco> list = service.findByLojaId(id);
		List<PrecoDTO> listDto = list.stream().map(x -> new PrecoDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> inserir(@RequestBody Preco preco){
		preco = service.save(preco);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(preco.getId()).toUri();
		return ResponseEntity.created(uri).build();	
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@PathVariable Integer id, @RequestBody Preco preco){
		preco.setId(id);
		preco = service.update(preco);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> excluir(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
