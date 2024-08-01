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
      
      Curso curso1 = new Curso();

      System.out.print("Digite o nome do curso: ");
      String nome = teclado.nextLine();

      curso1.setNome(nome);

      System.out.println("O nome digitado foi " + curso1.getNome());
    }
    }

