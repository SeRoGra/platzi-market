package com.platzi.market.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {
	
	private String nombre;
	
	private Long idCategoria;
	
	private Double precioVenta;
	
	private Long cantidadStock;
	
	private Boolean estado;

}
