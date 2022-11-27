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
public class CategoriaDTO {
	
	private Long id;
	
	private String descripcion;
	
	private Boolean estado;

}
