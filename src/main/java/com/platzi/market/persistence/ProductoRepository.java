package com.platzi.market.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.platzi.market.persistence.crud.IProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;

@Repository
public class ProductoRepository {

	@Autowired
	private IProductoCrudRepository productoCrudRepository;

	public List<Producto> getAll() {
		return (List<Producto>) productoCrudRepository.findAll();
	}

	public List<Producto> getByCategoria(Long idCategoria) {
		return productoCrudRepository.findByIdCategoria(idCategoria);
	}

	public Optional<List<Producto>> getEscasos(Long cantidad) {
		return productoCrudRepository.findBycantidadStockLessThanAndEstado(cantidad, true);
	}

	public Optional<Producto> getProducto(Long idProducto) {
		return productoCrudRepository.findById(idProducto);
	}

	public Producto saveProducto(Producto producto) {
		return productoCrudRepository.save(producto);
	}

	public void delete(Long id) {
		productoCrudRepository.deleteById(id);
	}
}
