public class Main {
    
    public static void main(String[] args) {

        Academia gym1, gym2;

        gym1 = new Academia("Ratos Bombados", "Roque Vernalha", "(41) 9 9283-2323");
        gym2 = new Academia("Super Fortões", "Centro Histórico", "(41) 9 2321-7548");

        System.out.print("Academia 1: ");               // printa o objeto do tipo Academia gym1    
        System.out.print(gym1.getNome()+" - ");
        System.out.print(gym1.getEndereco()+" - ");
        System.out.print(gym1.getTelefone());
        System.out.println();

        System.out.print("Academia 2: ");             // printa o objeto do tipo Academia gym2
        System.out.print(gym2.getNome()+" - ");
        System.out.print(gym2.getEndereco()+" - ");
        System.out.print(gym2.getTelefone());
        System.out.println();

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
    }
 
}
