package com.platzi.market.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "compras")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Compra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_compra")
	private Long id;
	
	@Column(name = "id_cliente")
	private String idCliente;
	
	private LocalDateTime fecha;
	
	@Column(name = "medio_pago")
	private Character medioPago;
	
	private String comentario;
	
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", insertable = false, updatable = false)
	private Cliente cliente;
	
	@OneToMany(mappedBy = "producto")
	private List<ComprasProducto> productos;

}
