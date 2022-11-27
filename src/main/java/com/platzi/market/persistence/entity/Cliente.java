package com.platzi.market.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cliente {

	@Id
	@Column(name = "id")
	private String id;
	
	private String nombre;
	
	private String apellidos;
	
	private String celular;
	
	private String direccion;
	
	@Column(name = "correo_electronico")
	private String correo;
	
	@OneToMany(mappedBy = "cliente")
	private List<Compra> compras;
	
}
