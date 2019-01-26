package com.economizamais.dto;

import com.economizamais.domain.Loja;

public class LojaDTO {
	
	private Integer id;
	private String razaoSocial;
	private String eslogan;
	private String telefone;
	private String email;
	private String endereco;
	private String cnpj;
	private String image;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String latitude;
	private String longitude;
	
	public LojaDTO(Loja loja) {
		this.id = loja.getId();
		this.razaoSocial = loja.getRazaoSocial();
		this.eslogan = loja.getEslogan();
		this.telefone = loja.getTelefone();
		this.email = loja.getEmail();
		this.endereco = loja.getEndereco().getEndereco();
		this.cnpj = loja.getCnpj();
		this.image = loja.getImage();
		this.bairro = loja.getEndereco().getBairro();
		this.cidade = loja.getEndereco().getCidade();
		this.uf = loja.getEndereco().getUf();
		this.cep = loja.getEndereco().getCep();
		this.latitude = loja.getEndereco().getLatitude();
		this.longitude = loja.getEndereco().getLongitude();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getEslogan() {
		return eslogan;
	}
	public void setEslogan(String eslogan) {
		this.eslogan = eslogan;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
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
