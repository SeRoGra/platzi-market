package com.platzi.market.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "compras_productos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComprasProducto {
	
	@EmbeddedId
	private ComprasProductoPK id;
	
	private Long cantidad;
	
	private Double total;
	
	private Boolean estado;
	
	@ManyToOne
	@JoinColumn(name = "id_compra", insertable = false, updatable = false)
	private Compra compra;
	
	@ManyToOne
	@JoinColumn(name = "id_producto", insertable = false, updatable = false)
	private Producto producto;

}
