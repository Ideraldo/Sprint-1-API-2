package br.com.fiap.api2.sprint1.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.api2.sprint1.dto.ProdutoDTO;
import br.com.fiap.api2.sprint1.mapper.ProdutoMapper;
import br.com.fiap.api2.sprint1.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	@Autowired
	private ProdutoMapper mapper;
	
	public ProdutoDTO salvarProduto(ProdutoDTO produto) {
		return(mapper.toProdutoDTO(repository.save(mapper.toProdutoModel(produto))));
	}
	
	public void deletarProduto(Long id) {
		repository.deleteById(id);
	}
	
	public ProdutoDTO buscarProdutoPorId(Long id) {
		return(mapper.toProdutoDTO(repository.findById(id).get()));
	}
	
	public List<ProdutoDTO> listarProdutos(){
		return repository.findAll().stream().map(p -> mapper.toProdutoDTO(p)).collect(Collectors.toList());
	}
}
