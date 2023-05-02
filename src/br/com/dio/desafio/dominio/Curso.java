package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso extends Conteudo {
    private Integer cargaHoraria;

    @Override
    public Double calcXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }



    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + getTitulo() +
                ", descricao='" + getDescricao() +
                ", cargaHoraria=" + cargaHoraria + ", " + calcXP().toString() + " Xp }";
    }
}