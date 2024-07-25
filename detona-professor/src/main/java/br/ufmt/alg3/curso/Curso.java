package br.ufmt.alg3.curso;

public class Curso {
    
    private String nome;
    private String periodo; // Matutino, vespertino e noturno
    private float nota; // Estrela 0 a 5 fracionada
    private String comentario;
    private String rga;
    private String semestre; // 2024/1

    // Setter
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }

    public void setNota(String nota){
        this.nota = nota;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public void setRGA(String rga){
        this.rga = rga;
    }

    public void setSemestre(String semestre){
        this.semestre = semestre;
    }


    // Getter
    public String getNome(){
        return nome;
    }

    public String getPeriodo(){
        return periodo;
    }    

    public String getNota(){
        return nota;
    }

    public String getComentario(){
        return comentario;
    }   

    public String getRGA(){
        return rga;
    }   
    public String getSemestre(){
        return semestre;
    }   
}