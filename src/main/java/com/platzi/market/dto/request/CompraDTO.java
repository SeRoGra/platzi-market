package com.platzi.market.dto.request;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CompraDTO {
	
	private Long idCompra;
	
	private String idCliente;
	
	private LocalDateTime fecha;
	
	private Character medioPago;
	
	private String comentario;
	
	private String estado;
	
	private List<ComprasProductoDTO> productos;

}
