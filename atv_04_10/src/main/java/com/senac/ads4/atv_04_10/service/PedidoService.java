package com.senac.ads4.atv_04_10.service;

import com.senac.ads4.atv_04_10.dto.PedidoDto;
import com.senac.ads4.atv_04_10.interfaces.IService;
import com.senac.ads4.atv_04_10.repository.PedidoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PedidoService implements IService<PedidoDto, Integer> {

    final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) { this.pedidoRepository = pedidoRepository;}

    @Override
    public PedidoDto create(PedidoDto entity) {
        log.info("PedidoService::create");
        return null;
    }

    @Override
    public PedidoDto read(Integer id) {
        log.info("PedidoService::read(id)");
        return null;
    }

    @Override
    public List<PedidoDto> read() {
        log.info("PedidoService::read()");
        return List.of();
    }

    @Override
    public PedidoDto update(Integer id, PedidoDto entity) {
        log.info("PedidoService::(id,entity)");
        return null;
    }

    @Override
    public void delete(Integer id) {
        log.info("PedidoService::delete(id)");
    }
}
