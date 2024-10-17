package com.senac.ads4.atv_04_10.resource;

import com.senac.ads4.atv_04_10.dto.ItensPedidoDto;
import com.senac.ads4.atv_04_10.interfaces.IResource;
import com.senac.ads4.atv_04_10.service.ItensPedidoService;
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
@RequestMapping(value = "/api/v1/itens_pedido")
public class ItensPedidoResource implements IResource<ItensPedidoDto, Integer> {

    final ItensPedidoService itensPedidoService;

    public ItensPedidoResource(ItensPedidoService itensPedidoService) { this.itensPedidoService = itensPedidoService;}

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
       @ApiResponses({
            @ApiResponse(responseCode = "201",
                    content = { @Content(schema = @Schema(implementation = ItensPedidoResource.class),
                            mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) }
    )

    public ItensPedidoDto create(ItensPedidoDto entity) {
        log.info("ShipperResource::create");
        return null;
    }

    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedidoDto get(@PathVariable Integer id) {
        log.info("ItensPedidoResource::get(id)");
        return null;
    }

    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ItensPedidoDto> get() {
        log.info("ItensPedidoResource::get()");
        return List.of();
    }

    @Override
    @PutMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedidoDto update(@PathVariable Integer id,
                                 @RequestBody ItensPedidoDto entity) {
        log.info("ItensPedidoResource::update(id, entity)");
        return null;
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("ItensPedidoResource::delete(id)");
    }
}
