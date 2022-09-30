package br.com.fiap.api2.sprint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.api2.sprint1.dto.ProdutoDTO;
import br.com.fiap.api2.sprint1.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
@Autowired
private ProdutoService produtoService;

	@PostMapping
	public ResponseEntity<ProdutoDTO> create(@RequestBody ProdutoDTO produto) {
		return ResponseEntity.ok(produtoService.salvarProduto(produto));
	}
	
	@GetMapping
	public ResponseEntity<List<ProdutoDTO>> get(){
		return ResponseEntity.ok(produtoService.listarProdutos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdutoDTO> getById(@PathVariable Long id) {
		return ResponseEntity.ok(produtoService.buscarProdutoPorId(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id) {
		produtoService.deletarProduto(id);
		return ResponseEntity.ok("Produto apagado com sucesso!");
	}
	
	@PutMapping
	public ResponseEntity<ProdutoDTO> update(@RequestBody ProdutoDTO produto) {
		return ResponseEntity.ok(produtoService.salvarProduto(produto));
	}
}