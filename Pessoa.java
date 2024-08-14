import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Pessoa {
    protected String nome;
    protected String genero;
    protected Date nascimento;
    protected Double altura;
    protected Double peso;

    public Pessoa(String nome, String genero, Date nascimento, double altura, double peso) {

        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    int calcularIdade(Date nascimento) {
        Date actualDate = new Date();
        
        long diffInMillies = Math.abs(actualDate.getTime() - nascimento.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return (int) (diff / 365);
    }

    public static Date nascimentoToDate(String nascimento) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        return simpleDateFormat.parse(nascimento);
    }

    public static String nascimentoToString(Date nascimento) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        return simpleDateFormat.format(nascimento);
    }
}



// atributos: nome, genero, nascimento, altura e peso
// criar método "calcularIdade" "nascimentoToString" e "nascimentoToDate"