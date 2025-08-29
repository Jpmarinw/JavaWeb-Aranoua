
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sexo;
    private String tipoSanguineo;
    private String cpf;

    private Calendar nascimento;

    private ArrayList<Medicao> medicoes = new ArrayList<Medicao>();

    public Calendar getNascimento() {
        return nascimento;
    }

    public String getNascimentoString() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formatador.format(nascimento.getTime());
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public Pessoa(String nome, String sexo, String cpf, String tipoSanguineo) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.tipoSanguineo = tipoSanguineo;
    }

    public Pessoa() {}

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getSexo() { return sexo; }

    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getTipoSanguineo() { return tipoSanguineo; }

    public void setTipoSanguineo(String tipoSanguineo) { this.tipoSanguineo = tipoSanguineo; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public ArrayList<Medicao> getMedicao() {
        return this.medicoes;
    }

    public void addMedicao(Medicao medicao) {
        this.medicoes.add(medicao);
    }

    public void removeMedicao(Medicao medicao) {
        this.medicoes.remove(medicao);
    }

    public int getIdade() {

        // Data atual (data de hoje)
        Calendar dataAtual = Calendar.getInstance();

//        dataAtual.setTime(new Date()); // Define para a data e hora atuais

        int idade = dataAtual.get(Calendar.YEAR) - this.nascimento.get(Calendar.YEAR);

        // Ajuste se o aniversário ainda não passou neste ano
        if (dataAtual.get(Calendar.DAY_OF_YEAR) < nascimento.get(Calendar.DAY_OF_YEAR)) {
            idade--;
        }
        return idade;
    }
}
