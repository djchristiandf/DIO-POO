package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    private int cargaHoraria;

    @Override
    public double calculateXP() {
        return XP_PADRAO * cargaHoraria;
    }
}
