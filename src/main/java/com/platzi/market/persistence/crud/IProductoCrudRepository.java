package com.platzi.market.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.platzi.market.persistence.entity.Producto;

public interface IProductoCrudRepository extends CrudRepository<Producto, Long> {

	List<Producto> findByIdCategoria(Long id);

	Optional<List<Producto>> findBycantidadStockLessThanAndEstado(Long cantidadStock, Boolean estado);

}
