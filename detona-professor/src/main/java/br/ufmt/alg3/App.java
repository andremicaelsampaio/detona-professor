package br.ufmt.alg3;

import java.util.Scanner;
import br.ufmt.alg3.curso.Curso;
import br.ufmt.alg3.professor.Professor;

public class App {
    public static void main(String[] args) {
        Curso[] respostas;
        respostas = new Curso[3];
        // Instanciando o objeto scanner
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < respostas.length; i++) {
            Curso c = new Curso();
            
            System.out.print("Digite o nome do curso: ");
            String nome = teclado.nextLine();
            
            c.setNome(nome);
            System.out.println("O nome digitado foi " + c.getNome());
            respostas[i] = c;
        }

        teclado.close(); // Fechar o scanner após o uso

        for (Curso cursos : respostas) {
            System.out.println("Curso avaliado: " + cursos.getNome());
        }
    }
}
