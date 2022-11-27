//package com.platzi.market.mapper;
//
//import org.mapstruct.InheritInverseConfiguration;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.Mappings;
//import org.mapstruct.ReportingPolicy;
//
//import com.platzi.market.dto.request.ComprasProductoDTO;
//import com.platzi.market.persistence.entity.ComprasProducto;
//
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
//public interface IComprasProductoMapper {
//
//	@Mappings({
//		@Mapping(source = "id.idProducto", target = "productoId"),
//		@Mapping(source = "estado", target = "active")
//	})
//	ComprasProductoDTO toComprasProductoDTO(ComprasProducto comprasProducto);
//	
//	@InheritInverseConfiguration
//	@Mappings({
//		@Mapping(target = "compra", ignore = true),
//		@Mapping(target = "producto", ignore = true),
//		@Mapping(target =  "id.idCompra", ignore = true)
//	})
//	ComprasProducto toComprasProducto(ComprasProductoDTO comprasProductoDTO);
//	
//}
