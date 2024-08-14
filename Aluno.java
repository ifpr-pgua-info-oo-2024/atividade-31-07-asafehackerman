import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno extends Pessoa{
    protected String graduacao;
    protected int idade;

    public Aluno (String nome, String genero, Date nascimento, double altura, double peso, String graduacao, int idade) {
        super(nome, genero, nascimento, altura, peso);
        
        this.graduacao = graduacao;
        this.idade = calcularIdade(nascimento);
    }

    // getters

    public String getNome() {
        return nome;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    // setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    public String toString () {
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");

        return "Aluno [Nome = "+ nome +", Nivel = "+ graduacao +
        ", Nascimento = "+ formato.format(nascimento) +", Idade = "+ idade +", Gênero = "+ genero +
        ", Altura = "+ altura +", Peso = "+ peso +"]";
    }
}