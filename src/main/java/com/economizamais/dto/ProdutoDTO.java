package com.economizamais.dto;

import java.io.Serializable;

import com.economizamais.domain.Produto;

public class ProdutoDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String image;
	private String descricao;
	private String detalhe;
//	private Double preco;
//	private String marca;
//	private String loja;
//	private String estado;
//	private String cidade;
//	private Integer latitude;
//	private Integer longitude;

	public ProdutoDTO() {
		
	}
	
	public ProdutoDTO(Produto produto) {
		super();
		this.id = produto.getId();
		this.nome = produto.getNome();
		this.image = produto.getImage();
		this.descricao = produto.getDescricao();
		this.detalhe = produto.getDetalhe();
//		this.marca = produto.getMarca().getNome();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}
}
