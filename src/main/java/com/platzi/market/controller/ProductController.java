package com.platzi.market.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.market.dto.request.ProductoDTO;
import com.platzi.market.persistence.entity.Producto;
import com.platzi.market.service.IProductService;

@RestController
@RequestMapping("/producto")
public class ProductController {

	@Autowired
	IProductService productService;

	@GetMapping("/all")
	public ResponseEntity<List<Producto>> findAll() {
		return new ResponseEntity<List<Producto>>(productService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Producto>> findById(@PathVariable(name = "id") Long id) {
		return new ResponseEntity<Optional<Producto>>(productService.findProductById(id), HttpStatus.OK);
	}

	@GetMapping("/categoria/{id}")
	public ResponseEntity<List<Producto>> findByCategory(@PathVariable(name = "id") Long id) {
		return new ResponseEntity<List<Producto>>(productService.findByCategory(id), HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<Producto> save(@RequestBody ProductoDTO request) {
		return new ResponseEntity<Producto>(productService.save(request), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable(name = "id") Long id) {
		return new ResponseEntity<Boolean>(productService.delete(id), HttpStatus.OK);
	}

}
