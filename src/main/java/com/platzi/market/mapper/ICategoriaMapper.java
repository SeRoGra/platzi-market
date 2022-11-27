//package com.platzi.market.mapper;
//
//import org.mapstruct.InheritInverseConfiguration;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.Mappings;
//import org.mapstruct.ReportingPolicy;
//
//import com.platzi.market.dto.request.CategoriaDTO;
//import com.platzi.market.persistence.entity.Categoria;
//
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
//public interface ICategoriaMapper {
//
//	CategoriaDTO toCategoriaDTO(Categoria categoria);
//	
//	@InheritInverseConfiguration
//	@Mappings({
//		@Mapping(target = "productos", ignore = true)
//	})
//	Categoria toCategoria(CategoriaDTO categoriaDTO);
//	
//}
