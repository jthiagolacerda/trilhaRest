package com.opensanca.trilharest.filmes.filmes;

import com.opensanca.trilharest.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.comum.ParametrosDePaginacao;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Created by jesus on 07/10/2017.
 */
public interface FilmesRepository {

    Pagina<Filme> buscarPaginaEmExibicao(ParametrosDePaginacao parametrosDePaginacao, LocalDate referencia);

    /**
     * @param id from Movie
     * @return Filme object
     * @throws  IllegalArgumentException if id parameters not found
     */
    Filme buscarPorId(UUID id);
}
