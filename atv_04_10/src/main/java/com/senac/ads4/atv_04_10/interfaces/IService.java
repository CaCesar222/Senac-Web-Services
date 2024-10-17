package com.senac.ads4.atv_04_10.interfaces;

import java.util.List;

public interface IService<T, N> {

    public T create(T entity);

    public T read(N id);

    public List<T> read();

    public T update(N id, T entity);

    public void delete(N id);
}
