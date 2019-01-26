package com.economizamais.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Preco {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Double preco;
	
	@ManyToOne
	@JoinColumn(name="id_loja")
	private Loja loja;
	
	@ManyToOne
	@JoinColumn(name="id_produto")
	private Produto produto;
	
	private Date validade;
	private Date cadastro;
	
	@Column(name="lista_app")
	private Boolean listaApp;
	
	public Preco() {
		
	}
	
	public Preco(Double preco, Loja loja, Produto produto, Date validade, Date cadastro, Boolean listaApp) {
		super();
		this.preco = preco;
		this.loja = loja;
		this.produto = produto;
		this.validade = validade;
		this.cadastro = cadastro;
		this.listaApp = listaApp;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Date getCadastro() {
		return cadastro;
	}

	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}

	public Boolean getListaApp() {
		return listaApp;
	}

	public void setListaApp(Boolean listaApp) {
		this.listaApp = listaApp;
	}	
}
