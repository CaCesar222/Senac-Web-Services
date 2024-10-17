package com.senac.ads4.atv_04_10.repository;

import com.senac.ads4.atv_04_10.model.ProdutoModel;
import com.sun.jdi.IntegerValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, IntegerValue> {
}
