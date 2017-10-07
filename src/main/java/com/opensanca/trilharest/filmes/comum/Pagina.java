package com.opensanca.trilharest.filmes.comum;

import java.util.List;

/**
 * Created by jesus on 07/10/2017.
 */
public class Pagina<T> {
    private List<T> registros;
    private Integer totalRegistros;

    public List<T> getRegistros() {
        return registros;
    }

    public void setRegistros(List<T> registros) {
        this.registros = registros;
    }

    public Integer getTotalRegistros() {
        return totalRegistros;
    }

    public void setTotalRegistros(Integer totalRegistros) {
        this.totalRegistros = totalRegistros;
    }
}
