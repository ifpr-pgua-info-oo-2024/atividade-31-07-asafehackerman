import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    private String nome;
    private String graduacao;
    private Date data_nascimento;
    private String genero;
    private double altura;
    private double peso;

    public Aluno (String nome, String graduacao, Date data_nascimento, String genero, double altura, double peso) {
        this.nome = nome;
        this.graduacao = graduacao;
        this.data_nascimento = data_nascimento;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public Aluno(String nome, String graduacao, Date data_nascimento) {
        this(nome, graduacao, data_nascimento, "", 0, 0);
    }

    // getters

    public String getNome() {
        return nome;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public Date getData_nascimento() {
        return data_nascimento;
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

    public void setData(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
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

    @Override
    public String toString () {
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");

        return "Aluno [Nome = "+ nome +", Nivel = "+ graduacao +
        ", Nascimento = "+ formato.format(data_nascimento) +", Gênero = "+ genero +
        ", Altura = "+ altura +", Peso = "+ peso +"]";
    }
}