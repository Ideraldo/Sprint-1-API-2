package br.com.fiap.api2.sprint1.dto;

public class ProdutoDTO {
	
	private Long id;
	private String nome;
	private String modelo;
	private String codProduto;
	private double preco;
	
	
	public ProdutoDTO() {
		
	}
	
	public ProdutoDTO(Long id, String nome, String modelo, String codProduto, double preco) {
		this.id = id;
		this.nome = nome;
		this.modelo = modelo;
		this.codProduto = codProduto;
		this.preco = preco;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
