package com.senac.ads4.atv_04_10.service;

import com.senac.ads4.atv_04_10.dto.ProdutoDto;
import com.senac.ads4.atv_04_10.interfaces.IService;
import com.senac.ads4.atv_04_10.repository.ProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProdutoService implements IService<ProdutoDto, Integer> {

    final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) { this.produtoRepository = produtoRepository;}

    @Override
    public ProdutoDto create(ProdutoDto entity) {
        log.info("ProdutoService::create");
        return null;
    }

    @Override
    public ProdutoDto read(Integer id) {
        log.info("ProdutoService::read(id)");
        return null;
    }

    @Override
    public List<ProdutoDto> read() {
        log.info("ProdutoService::read()");
        return List.of();
    }

    @Override
    public ProdutoDto update(Integer id, ProdutoDto entity) {
        log.info("ProdutoService::read(id,entity)");
        return null;
    }

    @Override
    public void delete(Integer id) {
        log.info("ProdutoService::delete(id)");
    }
}
