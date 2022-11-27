package com.platzi.market.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platzi.market.dto.request.ProductoDTO;
import com.platzi.market.persistence.ProductoRepository;
import com.platzi.market.persistence.entity.Producto;
import com.platzi.market.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	private ProductoRepository productoRepository;
	
//	@Autowired
//	private IProductoMapper productoMapper;

	@Override
	public List<Producto> findAll() {
		return productoRepository.getAll();
	}

	@Override
	public Optional<Producto> findProductById(Long id) {
		return productoRepository.getProducto(id);
	}

	@Override
	public List<Producto> findByCategory(Long id) {
		return productoRepository.getByCategoria(id);
	}

	@Override
	public Producto save(ProductoDTO productoDTO) {
		
		Producto request = Producto.builder()
			.nombre(productoDTO.getNombre())
			.idCategoria(productoDTO.getIdCategoria())
			.precioVenta(productoDTO.getPrecioVenta())
			.cantidadStock(productoDTO.getCantidadStock())
			.estado(productoDTO.getEstado())
			.build();
		
		return productoRepository.saveProducto(request);
	}

	@Override
	public Boolean delete(Long id) {
		return findProductById(id).map(product -> {
			productoRepository.delete(id);
			return true;
		}).orElse(false);
	}
	

}
