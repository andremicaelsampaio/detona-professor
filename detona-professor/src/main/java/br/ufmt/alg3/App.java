package br.ufmt.alg3;
import br.ufmt.alg3.curso.Curso;
import br.ufmt.alg3.professor.Professor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Curso curso = new Curso(); //Instanciando a classe Curso (Criando um objeto)
        
        // curso.setNome("Sistemas de Informação");
      
        // Curso curso2 = new Curso();

        // curso2.setNome("Ciencia da computação");

        // curso = curso2; // SI recebe CC

        // System.out.println( curso.getNome() );
        // System.out.println( curso2.getNome() );

        Professor professor = new Professor();

        professor.setNome("Testes n 2");

        System.out.println(professor.getNome());
    
    }
    }

