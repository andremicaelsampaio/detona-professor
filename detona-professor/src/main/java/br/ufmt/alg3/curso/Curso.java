package br.ufmt.alg3.curso;

public class Curso {
    
    private String nome;
    private String periodo; // Matutino, vespertino e noturno
    private float nota; // Estrela 0 a 5 fracionada
    private String comentario;
    private String rga;
    private String Semestre; // 2024/1

    // Setter
    public void setNome(String nome){
        this.nome = nome;
    }

    // Getter
    public String getNome(){
        return nome;
    }
}
