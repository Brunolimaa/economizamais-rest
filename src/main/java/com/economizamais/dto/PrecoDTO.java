package com.economizamais.dto;

import java.io.Serializable;
import java.util.Date;

import com.economizamais.domain.Preco;

public class PrecoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String image;
	private String descricao;
	private String detalhe;
	private Double preco;
	private String marca;
	private Date validade;
	private Integer idLoja;
	private String loja;
	private String imageLoja;
	private String estado;
	private String cidade;
	private String latitude;
	private String longitude;
		
	public PrecoDTO(Preco preco) {
		super();
		this.id = preco.getId();
		
		
		this.nome = preco.getProduto().getNome();
		this.image = preco.getProduto().getImage();
		this.descricao = preco.getProduto().getDescricao();
		this.detalhe = preco.getProduto().getDetalhe();
		this.preco = preco.getPreco();
		this.marca = preco.getProduto().getMarca();
		this.validade = preco.getValidade();
		this.idLoja = preco.getLoja().getEndereco().getId();
		this.loja = preco.getLoja().getRazaoSocial();
		this.imageLoja = preco.getLoja().getImage();
		this.estado = preco.getLoja().getEndereco().getUf();
		this.cidade = preco.getLoja().getEndereco().getCidade();
		this.latitude = preco.getLoja().getEndereco().getLatitude();
		this.longitude = preco.getLoja().getEndereco().getLongitude();
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
		
	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Integer getIdLoja() {
		return idLoja;
	}

	public void setIdLoja(Integer idLoja) {
		this.idLoja = idLoja;
	}

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}
	
	public String getImageLoja() {
		return imageLoja;
	}

	public void setImageLoja(String imageLoja) {
		this.imageLoja = imageLoja;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
		
}
