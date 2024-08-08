package br.ufmt.alg3.curso;

import br.ufmt.alg3.Identificador;

<<<<<<< HEAD
public class Curso extends Identificador {
    private String rga;
    private String periodo;
=======
public class Curso extends Identificador{
    
    
    private String periodo; // Matutino, vespertino e noturno   
    private String rga;
>>>>>>> main

    public Curso() {
        periodo = "Matutino";
    }
<<<<<<< HEAD

    public Curso(String nome) {
        this.nome = nome; // nome é protected na classe pai
        this.periodo = "Noturno";
    }

    public String getRga() {
        return rga;
    }

=======
    public Curso(String nome) {
        this.nome = nome; // nome é protected na classe pai
        this.periodo = "Noturno";
    }
    
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public String getRga() {
        return rga;
    }
>>>>>>> main
    public void setRga(String rga) {
        this.rga = rga;
    }
   

<<<<<<< HEAD
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    
}
=======
  
}
>>>>>>> main
