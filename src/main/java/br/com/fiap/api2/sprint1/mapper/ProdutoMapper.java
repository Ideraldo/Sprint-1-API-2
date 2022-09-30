package br.com.fiap.api2.sprint1.mapper;

import org.springframework.stereotype.Component;

import br.com.fiap.api2.sprint1.dto.ProdutoDTO;
import br.com.fiap.api2.sprint1.models.ProdutoModel;

@Component
public class ProdutoMapper {

	private Long id;
	private String nome;
	private String modelo;
	private String codProduto;
	private double preco;
	
	public ProdutoDTO toProdutoDTO(ProdutoModel model) {
		id = model.getId();
		nome = model.getNome();
		modelo = model.getModelo();
		codProduto = model.getCodProduto();
		preco = model.getPreco();
		return new ProdutoDTO(id, nome, modelo, codProduto, preco);
	}
	
	public ProdutoModel toProdutoModel(ProdutoDTO dto) {
		id = dto.getId();
		nome = dto.getNome();
		modelo = dto.getModelo();
		codProduto = dto.getCodProduto();
		preco = dto.getPreco();
		return new ProdutoModel(id, nome, modelo, codProduto, preco);
	}
	
}
