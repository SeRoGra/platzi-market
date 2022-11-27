package com.platzi.market.service;

import java.util.List;
import java.util.Optional;

import com.platzi.market.dto.request.ProductoDTO;
import com.platzi.market.persistence.entity.Producto;

public interface IProductService {
	
	List<Producto> findAll();
	
	Optional<Producto> findProductById(Long id);
	
	List<Producto> findByCategory(Long id);
	
	Producto save(ProductoDTO productoDTO);

	Boolean delete(Long id);
	
}
