import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}

public static void cadastrarAcademia(Academia gym, Scanner scan) throws InterruptedException {
    int fim = 0;   
    String nome, endereco, telefone;

    do {
        fim = 0;
        clearScreen();
        System.out.print("Insira um nome: ");
        nome = scan.nextLine();
        gym.setNome(nome);
        System.out.println();

        if (nome == null) {
            System.out.println("Nome inválido. Tente novamente.");
            java.lang.Thread.sleep(1000);
        } else {
            fim++;
        }
    } while (fim != 0);

    do {
        fim = 0;
        clearScreen();
        System.out.print("Insira um endereço: ");
        endereco = scan.nextLine();
        gym.setEndereco(endereco);
        System.out.println();

        if (nome == null) {
            System.out.println("Endereço inválido. Tente novamente.");
            java.lang.Thread.sleep(1000);
        } else {
            fim++;
        }
    } while (fim != 0);

    do {
        fim = 0;    
        clearScreen();
        System.out.print("Insira um telefone: ");
        telefone = scan.nextLine();
        gym.setTelefone(telefone);
        System.out.println();

        if (nome == null) {
            System.out.println("Telefone inválido. Tente novamente.");
            java.lang.Thread.sleep(1000);
        } else {
            fim++;
        }
    } while (fim != 0);
}
    public static void main(String[] args) throws ParseException, InterruptedException {

        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        Scanner scan = new Scanner(System.in);
        Academia gym1 = new Academia(null, null, null);
        Academia gym2 = new Academia(null, null, null);
        
        cadastrarAcademia(gym1, scan);

        // gym1

        System.out.print("Academia 1: ");               // printa o objeto do tipo Academia gym1    
        System.out.print(gym1.getNome()+" - ");
        System.out.print(gym1.getEndereco()+" - ");
        System.out.print(gym1.getTelefone());
        System.out.println();

        // Cadastro de alunos pra gym1

        // ALuno 1
        Date data1 = formato.parse("16/05/2007");
        
        gym1.alunos.add(new Aluno("Jubileu", "Masculino", data1, 1.76, 81.1, "Iniciante", 1));

        // ALuno 2
        Date data2 = formato.parse("23/04/2005");
        gym1.alunos.add(new Aluno("Carlos", "Masculino", data2, 1.81, 101.3, "Intermediário", 1));

        // ALuno 3
        Date data3 = formato.parse("17/03/1998");
        gym1.alunos.add(new Aluno("Roberta", "Feminino", data3, 1.96, 151.7, "Experiente", 1));

        // gym2

        System.out.print("Academia 2: ");             // printa o objeto do tipo Academia gym2
        System.out.print(gym2.getNome()+" - ");
        System.out.print(gym2.getEndereco()+" - ");
        System.out.print(gym2.getTelefone());
        System.out.println();

        // Cadastro de alunos pra gym2

        // ALuno 4
        Date data4 = formato.parse("23/12/2008");
        gym2.alunos.add(new Aluno("Carlinhos", "Masculino", data4, 1.78, 61.0, "Iniciante", 1));

        // ALuno 5
        Date data5 = formato.parse("31/08/1993");
        gym2.alunos.add(new Aluno("Maria", "Feminino", data5, 1.51, 101.3, "Intermediário", 1));

        // ALuno 6
        Date data6 = formato.parse("11/03/1978");
        gym2.alunos.add(new Aluno("Velho doido", "Masculino", data6, 2.11, 154.5, "Experiente", 1));



        gym1.setNome("Ratos Gymbrothers");                          // muda o nome, endereço e telefone de gym1
        gym1.setEndereco("Shopping Mall");
        gym1.setTelefone("(41) 9 0237-4932");

        gym2.setNome("Carpas Trembolona");                         // muda o nome, endereço e telefone de gym2
        gym2.setEndereco("Porto Seguro");
        gym2.setTelefone("(41) 9 2304-3948");

        System.out.println();
        System.out.println("Mudando...");
        System.out.println();

        System.out.print("Academia 1: ");               // printa o objeto mudado do tipo Academia gym1    
        System.out.print(gym1.getNome()+" - ");
        System.out.print(gym1.getEndereco()+" - ");
        System.out.print(gym1.getTelefone());
        System.out.println();

        System.out.print("Academia 2: ");             // printa o objeto mudado do tipo Academia gym2
        System.out.print(gym2.getNome()+" - ");
        System.out.print(gym2.getEndereco()+" - ");
        System.out.print(gym2.getTelefone());
        System.out.println();

        System.out.println();
        System.out.println("Alunos da Academia 1:");
        for (Aluno aluno : gym1.getAlunos ()) {
            System.out.println (aluno.toString ());
        }

        System.out.println();
        System.out.println("Alunos da Academia 2:");
        for (Aluno aluno : gym2.getAlunos ()) {
            System.out.println (aluno.toString ());
        }
    scan.close();
    }
 
}
