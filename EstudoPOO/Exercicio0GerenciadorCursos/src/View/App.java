package View;

import java.util.Scanner;

import Controler.Curso;
import Model.Aluno;
import Model.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        //criar curso e incluir professor
        Professor professor = new Professor("José Pereira", "123.456.789.000", 15000.00);
        Curso curso = new Curso("Programação Java", professor);

        //menu de opções
        int operacao;
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        while (continuar) {
            System.out.println("=========================");
            System.out.println("Escolha a Opção Desejada");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Informações do Curso");
            System.out.println("3. SAIR");
            System.out.println("=========================");
            operacao = sc.nextInt();
            switch (operacao) {
                case 1://adicionar aluno
                    System.out.println("Informe o Nome do Aluno: ");
                    String nomeA = sc.nextLine();
                    System.out.println("informe o CPF do Aluno: ");
                    String cpfA = sc.nextLine();
                    System.out.println("Informe o Número da Matrícula: ");
                    String matriculaA = sc.nextLine();
                    System.out.println("INforme a Nota do Aluno: ");
                    double notaA = sc.nextDouble();
                    Aluno aluno = new Aluno(nomeA, cpfA, matriculaA, notaA);
                    curso.adicionarAluno(aluno);
                    System.out.println("Aluno Adicionado com Sucesso");
                    System.out.println("============================");
                    break;

                case 2://informações do curso
                    curso.exibirInformacoesCurso();
                    
                    break;
                case 3://SAIR
                    System.out.println("Saindo...");
                    continuar = false;
                default:
                    System.out.println("Informe um Valor Válido");
                    break;
            }

        }

    }
}
