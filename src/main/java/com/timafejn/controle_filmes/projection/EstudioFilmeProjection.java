package com.timafejn.controle_filmes.projection;

public interface EstudioFilmeProjection {
    Long getIdGenero ();
    Long getIdFilme();
    String getTitulo();
    Integer getAno();
    Integer getDuracao();
    String getSinopse();
    String getURL();
}
