package com.senac.ads4.atv_04_10.resource;

import com.senac.ads4.atv_04_10.dto.PedidoDto;
import com.senac.ads4.atv_04_10.interfaces.IResource;
import com.senac.ads4.atv_04_10.service.PedidoService;
import com.senac.ads4.atv_04_10.service.ProdutoService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/pedido")
public class PedidoResource implements IResource<PedidoDto, Integer> {

    final PedidoService pedidoService;

    public PedidoResource(PedidoService pedidoService) {this.pedidoService = pedidoService;}

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )

    @ApiResponses({
            @ApiResponse(responseCode = "201",
                    content = { @Content(schema = @Schema(implementation = PedidoResource.class),
                            mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) }
    )

    public PedidoDto create(@RequestBody PedidoDto entity) {
        return null;
    }

    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public PedidoDto get(@PathVariable Integer id) {
        log.info("PedidoResource::get(id)");
        return null;
    }

    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<PedidoDto> get() {
        log.info("PedidoResource::get()");
        return List.of();
    }

    @Override
    @PutMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public PedidoDto update(@PathVariable Integer id,
                            @RequestBody PedidoDto entity) {
        log.info("PedidoResource::update(id,entity)");
        return null;
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("PedidoResource::delete(id)");

    }
}
