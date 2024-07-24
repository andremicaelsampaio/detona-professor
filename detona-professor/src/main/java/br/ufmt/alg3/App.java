package br.ufmt.alg3;
import br.ufmt.alg3.curso.Curso;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Curso curso = new Curso(); //Instanciando a classe Curso (Criando um objeto)
        curso.nome = "Sistemas de Informação";    
        Curso curso2 = curso;
        curso2.nome = "Ciencia da Comp";



        System.out.println( curso.nome );
        System.out.println( curso2.nome );
    }
    }

