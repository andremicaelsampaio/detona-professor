package br.ufmt.alg3;
import java.util.Scanner;

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
       Curso[] respostas;
       respostas = new Curso[3];
       // Estanciando o objeto curso
      Scanner teclado;
      teclado = new Scanner(System.in);
      // Estanciando o objeto scanner
      
      for (int i=0;i<respostas.length;i++){
      Curso c = new Curso();
      
      System.out.print("Digite os nome do curso: ");
      String nome = teclado.nextLine();

      c.setNome(nome);
      System.out.println("O nome digitado foi " + c.getNome());
      respostas[i] = c;
    }

    for(Curso cursos : respostas) {
        System.out.println("Curso avaliado:" + cursos.getNome());
    }

    }
    }

