package com.senac.ads4.atv_04_10.service;

import com.senac.ads4.atv_04_10.dto.ItensPedidoDto;
import com.senac.ads4.atv_04_10.interfaces.IService;
import com.senac.ads4.atv_04_10.repository.ItensPedidoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ItensPedidoService implements IService<ItensPedidoDto, Integer> {

    final ItensPedidoRepository itensPedidoRepository;

    public ItensPedidoService(ItensPedidoRepository itensPedidoRepository){this.itensPedidoRepository = itensPedidoRepository;}

    @Override
    public ItensPedidoDto create(ItensPedidoDto entity) {
        log.info("ItensPedidoService::create");
        return null;
    }

    @Override
    public ItensPedidoDto read(Integer id) {
        log.info("ItensPedidoService::read(id)");
        return null;
    }

    @Override
    public List<ItensPedidoDto> read() {
        log.info("ItensPedidoService::read()");
        return List.of();
    }

    @Override
    public ItensPedidoDto update(Integer id, ItensPedidoDto entity) {
        log.info("ItensPedidoService::update(id,entity)");
        return null;
    }

    @Override
    public void delete(Integer id) {
        log.info("ItensPedidoService::delete(id)");

    }
}
