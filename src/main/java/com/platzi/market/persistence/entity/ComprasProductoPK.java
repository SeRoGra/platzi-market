package com.platzi.market.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ComprasProductoPK implements Serializable{

	@Column(name = "id_compra")
	private Long idCompra;
	
	@Column(name = "id_producto")
	private Long idProducto;
	
}
