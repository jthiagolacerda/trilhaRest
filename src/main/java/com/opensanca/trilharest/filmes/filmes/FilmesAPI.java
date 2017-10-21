package com.opensanca.trilharest.filmes.filmes;

import com.opensanca.trilharest.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.comum.ParametrosDePaginacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Created by jesus on 07/10/2017.
 */
@RestController
@RequestMapping("/filmes")
public class FilmesAPI {

    @Autowired
    private FilmesRepository filmesRepository;

    @RequestMapping(path="/em-exibicao", method = RequestMethod.GET)
    public Pagina<Filme> getEmExibicao(ParametrosDePaginacao parametrosDePaginacao, LocalDate referencia){
        if(parametrosDePaginacao==null){
            parametrosDePaginacao = new ParametrosDePaginacao();
        }
        LocalDate hoje = LocalDate.now();
        return filmesRepository.buscarPaginaEmExibicao(parametrosDePaginacao, hoje);
    }

    @GetMapping("/id")
    public Filme buscarPorId(@PathVariable UUID id){
        return this.filmesRepository.buscarPorId(id);

    }

}
