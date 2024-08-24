import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}

 public static void main(String[] args) throws ParseException, InterruptedException {

        int fim = 0, operacao;    
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);
        Academia gym1 = new Academia("Ratos Gymbrothers", "Shopping Mall","(41) 9 0237-4932");
        Academia gym2 = new Academia("Carpas Trembolona","Porto Seguro", "(41) 9 2304-3948");

        do {
            String nome, genero, nascimentoStr, graduacao;
            int idade, academia = 0;;
            double altura, peso;
            Date nascimentoDate;

            clearScreen();
            System.out.print("SISTEMA DE ACADEMIA\n0)Sair\n1)Cadastrar Aluno\n2)Ver Alunos\n3)Deletar Alunos\n\n> ");
            operacao = scan.nextInt();
            scan.nextLine();
            switch(operacao) {
                case 0:
                    clearScreen();
                    fim++;
                break;

                case 1:
                    academia = 0;
                
                    clearScreen();
                    System.out.print("Insira o nome do aluno: ");
                    nome = scan.nextLine();
                    System.out.print("\nInsira o gênero do aluno: ");
                    genero = scan.nextLine();
                    System.out.print("\nInsira a data de nascimento do aluno: ");
                    nascimentoStr = scan.nextLine();
                    nascimentoDate = Aluno.nascimentoToDate(nascimentoStr);
                    idade = Aluno.calcularIdade(nascimentoDate);
                    System.out.println(formato.format(nascimentoDate));
                    System.out.print("\nInsira a altura do aluno: ");
                    altura = scan.nextDouble();
                    System.out.print("\nInsira o peso do aluno: ");
                    peso = scan.nextDouble();
                    scan.nextLine(); // precaução pra pegar a quebra de linha e não bugar graduação/nível do aluno
                    System.out.print("\nInsira o nível do aluno: ");
                    graduacao = scan.nextLine();

                    clearScreen();
                    System.out.print("Academia 1: ");             // printa o objeto do tipo Academia gym2
                    System.out.print(gym1.getNome()+" - ");
                    System.out.print(gym1.getEndereco()+" - ");
                    System.out.print(gym1.getTelefone());
                    System.out.println();

                    System.out.print("Academia 2: ");             // printa o objeto do tipo Academia gym2
                    System.out.print(gym2.getNome()+" - ");
                    System.out.print(gym2.getEndereco()+" - ");
                    System.out.print(gym2.getTelefone());
                    System.out.println();
                    
                    System.out.print("Insira a academia que deseja inserir o aluno: ");
                    academia = scan.nextInt();

                    if (academia == 1) {
                        gym1.alunos.add(new Aluno(nome, genero, nascimentoDate, altura, peso, graduacao, idade));                
                    } else if (academia == 2) {
                        gym2.alunos.add(new Aluno(nome, genero, nascimentoDate, altura, peso, graduacao, idade));
                    }
                break;

                case 2:
                    academia = 0;

                    clearScreen();
                    System.out.println("1) "+gym1.toString()+"");
                    for (Aluno aluno : gym1.getAlunos ()) {
                        System.out.println (aluno.toString ());
                    }

                    System.out.println("2) "+gym2.toString()+"");
                    for (Aluno aluno : gym2.getAlunos ()) {
                        System.out.println (aluno.toString ());
                    } scan.nextLine();
                break;

                case 3:
                    int id;

                    clearScreen();
                    System.out.println("\n1) "+gym1.toString());
                    System.out.println("2) "+gym2.toString());
                    System.out.print("\nInsira o ID da academia: ");
                    academia = scan.nextInt();
                    if (academia == 1) {
                        int a = 1;
                        
                        clearScreen();
                        for (Aluno aluno : gym1.getAlunos()) {
                            System.out.println(a + ") " + aluno.toString() + "\n");
                            a++;
                        }

                        System.out.print("Digite o ID do aluno que deseja remover: ");
                        id = scan.nextInt();
                        gym1.alunos.remove(id - 1);
                    } else if (academia == 2) {
                        int a = 1;

                        clearScreen();
                        for (Aluno aluno : gym2.getAlunos()) {
                            System.out.println(a + ") " + aluno.toString() + "\n");
                            a++;
                        }

                        System.out.print("Digite o ID do aluno que deseja remover: ");
                        id = scan.nextInt();
                        gym2.alunos.remove(id - 1);
                    }
                break;
                default:
                    System.out.println("Opção inválida!");
                break;
            }
        } while (fim == 0);
    scan.close();
    }
 
}
