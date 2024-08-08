package br.ufmt.alg3.curso;

import br.ufmt.alg3.Identificador;

public class Curso extends Identificador {
    private String rga;
    private String periodo;

    public Curso() {
        periodo = "Matutino";
    }

    public Curso(String nome) {
        this.nome = nome; // nome é protected na classe pai
        this.periodo = "Noturno";
    }

    public String getRga() {
        return rga;
    }

    public void setRga(String rga) {
        this.rga = rga;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    
}
