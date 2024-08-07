import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        Academia gym1 = new Academia("Ratos Bombados", "Roque Vernalha", "(41) 9 9283-2323");
        Academia gym2 = new Academia("Super Fortões", "Centro Histórico", "(41) 9 2321-7548");

        // gym1

        System.out.print("Academia 1: ");               // printa o objeto do tipo Academia gym1    
        System.out.print(gym1.getNome()+" - ");
        System.out.print(gym1.getEndereco()+" - ");
        System.out.print(gym1.getTelefone());
        System.out.println();

        // Cadastro de alunos pra gym1

        // ALuno 1
        Date data1 = formato.parse("16/05/2007");
        gym1.alunos.add(new Aluno("Jubileu", "Iniciante", data1, "Masculino", 1.76, 81.1));

        // ALuno 2
        Date data2 = formato.parse("23/04/2005");
        gym1.alunos.add(new Aluno("Carlos", "Intermediário", data2, "Masculino", 1.81, 101.3));

        // ALuno 3
        Date data3 = formato.parse("17/03/1998");
        gym1.alunos.add(new Aluno("Roberta", "Experiente", data3, "Feminino", 1.96, 151.7));

        // gym2

        System.out.print("Academia 2: ");             // printa o objeto do tipo Academia gym2
        System.out.print(gym2.getNome()+" - ");
        System.out.print(gym2.getEndereco()+" - ");
        System.out.print(gym2.getTelefone());
        System.out.println();

        // Cadastro de alunos pra gym2

        // ALuno 4
        Date data4 = formato.parse("23/12/2008");
        gym2.alunos.add(new Aluno("Carlinhos", "Iniciante", data4, "Masculino", 1.78, 61.0));

        // ALuno 5
        Date data5 = formato.parse("31/08/1993");
        gym2.alunos.add(new Aluno("Maria", "Intermediário", data5, "Feminino", 1.51, 101.3));

        // ALuno 6
        Date data6 = formato.parse("11/03/1978");
        gym2.alunos.add(new Aluno("Velho doido", "Experiente", data6, "Masculino", 2.11, 154.5));



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

        System.out.println("Alunos da Academia 1:");
        for (Aluno aluno : gym1.getAlunos ()) {
            System.out.println (aluno.toString ());
            System.out.println ();
        }

        System.out.println();

        System.out.println("Alunos da Academia 2:");
        for (Aluno aluno : gym2.getAlunos ()) {
            System.out.println (aluno.toString ());
            System.out.println ();
        }
    }
 
}
