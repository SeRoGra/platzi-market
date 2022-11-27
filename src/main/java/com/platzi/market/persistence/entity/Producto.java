package com.platzi.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "productos")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private Long id;
	
	private String nombre;
	
	@Column(name = "id_categoria")
	private Long idCategoria;
	
	@Column(name = "codigo_barras")
	private String codigoBarras;
	
	@Column(name = "precio_venta")
	private Double precioVenta;
	
	@Column(name = "cantidad_stock")
	private Long cantidadStock;
	
	private Boolean estado;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria", insertable = false, updatable = false)
	@JsonManagedReference
	private Categoria categoria;
	
}
