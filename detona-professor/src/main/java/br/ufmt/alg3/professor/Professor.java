package br.ufmt.alg3.professor;

public class Professor {

    private String nome;
    private String areaAtuacao;
    private String disciplina;
    private float nota;
    private String semestre;
    private String departamento;
    private String comentario;


    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setNota (float nota) {
        this.nota = nota;
    }

    public void setSemestre(String semestre){
        this.semestre = semestre;
    }

    public void setDepartamento (String departamento) {
        this.departamento = departamento;
    }

    public void setComentario (String comentario) {
        this.comentario = comentario;
    }
    //Getters

    public String getNome() {
        return nome;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public float getNota() {
        return nota;
    }

    public String getSemestre(){
        return semestre;
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getComentario(){
        return comentario;
    }

}
