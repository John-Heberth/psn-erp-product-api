package com.erp.java.api.openapi;

import com.erp.java.domain.entity.ProductEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Tag(name = "Product",description = "Api de Produtos")
public interface ProductControllerOpenApi {

    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Cria um novo produto")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "500", description = "Entrada inválida")

    })
    @GetMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE
    )

    ProductEntity createProduct(@RequestBody ProductEntity productEntity);


    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Recupera todos os produtos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "500", description = "Entrada inválida")

    })
    @PostMapping(value = "/findAll", produces = MediaType.APPLICATION_JSON_VALUE
    )
    List<ProductEntity> getAllProdutos();
}

