package com.opensanca.trilharest.filmes.comum;

/**
 * Created by jesus on 07/10/2017.
 */
public class ParametrosDePaginacao {

    private Integer pagina = 1;
    private Integer tamanhoDaPagina = 3;

    public Integer getPagina() {
        return pagina;
    }

    public void setPagina(Integer pagina) {
        this.pagina = pagina;
    }

    public Integer getTamanhoDaPagina() {
        return tamanhoDaPagina;
    }

    public void setTamanhoDaPagina(Integer tamanhoDaPagina) {
        this.tamanhoDaPagina = tamanhoDaPagina;
    }
}
