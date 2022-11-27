//package com.platzi.market.mapper;
//
//import org.mapstruct.Mapper;
//import org.mapstruct.ReportingPolicy;
//
//import com.platzi.market.dto.request.ProductoDTO;
//import com.platzi.market.persistence.entity.Producto;
//
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
//public interface IProductoMapper {
//
////	@Mappings({
//////		@Mapping(source = "id", target = "id"),
////		@Mapping(source = "nombre", target = "nombre"),
////		@Mapping(source = "idCategoria", target = "ididCategoria"),
////		@Mapping(source = "precioVenta", target = "precioVenta"),
////		@Mapping(source = "cantidadStock", target = "cantidadStock"),
////		@Mapping(source = "estado", target = "estado")
////	})
//	ProductoDTO toProductoDTO(Producto producto);
//
////	@Mappings({
////		@Mapping(target = "codigoBarras", ignore = true),
////		@Mapping(target = "categoria", ignore = true)
////	})
//	Producto toProducto(ProductoDTO productoDTO);
//
//}
