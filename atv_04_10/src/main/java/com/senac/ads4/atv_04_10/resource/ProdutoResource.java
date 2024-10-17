package com.senac.ads4.atv_04_10.resource;

import com.senac.ads4.atv_04_10.dto.ProdutoDto;
import com.senac.ads4.atv_04_10.interfaces.IResource;
import com.senac.ads4.atv_04_10.service.ProdutoService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/produto")
public class ProdutoResource implements IResource<ProdutoDto, Integer> {

    final ProdutoService produtoService;

    public ProdutoResource(ProdutoService produtoService) { this.produtoService = produtoService;}

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )

    @ApiResponses({
            @ApiResponse(responseCode = "201",
                    content = { @Content(schema = @Schema(implementation = ProdutoResource.class),
                            mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) }
    )

    public ProdutoDto create(@RequestBody ProdutoDto entity) {
        log.info("ProdutoResource::create");
        return null;
    }

    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutoDto get(@PathVariable Integer id) {
        log.info("ProdutoResource::get(id)");
        return null;
    }

    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ProdutoDto> get() {
        log.info("ProdutoResource::get()");
        return List.of();
    }

    @Override
    @PutMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutoDto update(@PathVariable Integer id,
                             @RequestBody ProdutoDto entity) {
        log.info("ProdutoResource::update(id, entity)");
        return null;
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("ProdutoResource::delete(id)");
    }
}
