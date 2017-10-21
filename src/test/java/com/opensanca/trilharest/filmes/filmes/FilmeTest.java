package com.opensanca.trilharest.filmes.filmes;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class FilmeTest {

    @Test
    public void foraDeExibicaoSeDatasNulas(){
        Filme filme = new Filme(null, null, null, null, null, null);
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean result = filme.emExibicao(referencia);
        Assert.assertFalse(result);
    }

    @Test
    public void emExibicaoSeDentroIntervaloDeDatas(){
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2017, 10, 1),
                LocalDate.of(2017, 10, 30));
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean result = filme.emExibicao(referencia);
        Assert.assertTrue(result);
    }

    @Test
    public void foraDeExibicaoSeForaDoIntervaloDeDatas(){
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2017, 10, 1),
                LocalDate.of(2017, 10, 20));
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean result = filme.emExibicao(referencia);
        Assert.assertFalse(result);
    }

    @Test
    public void foraDeExibicaoSeInicioDeExibicaoNull(){
        Filme filme = new Filme(null, null, null, null,
                null,
                LocalDate.of(2017, 10, 20));
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean result = filme.emExibicao(referencia);
        Assert.assertFalse(result);
    }

    @Test
    public void foraDeExibicaoSeFimDeExibicaoNull(){
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2017, 10, 1),
                null);
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean result = filme.emExibicao(referencia);
        Assert.assertFalse(result);
    }

    @Test
    public void exExibicaoSeInicioExatamenteHoje(){
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2017, 10, 21),
                LocalDate.of(2017, 10, 22));
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean result = filme.emExibicao(referencia);
        Assert.assertTrue(result);
    }

    @Test
    public void exExibicaoSeFimExatamenteHoje(){
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2017, 10, 20),
                LocalDate.of(2017, 10, 21));
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean result = filme.emExibicao(referencia);
        Assert.assertTrue(result);
    }

    @Test
    public void foraDeExibicao(){
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2017, 10, 20),
                LocalDate.of(2017, 10, 21));
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean result = filme.emExibicao(referencia);
        Assert.assertTrue(result);
    }



}
