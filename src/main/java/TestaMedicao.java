import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestaMedicao {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João Pedro");
        pessoa.setCpf("70338996290");

        Calendar dataNascimento = Calendar.getInstance();

        dataNascimento.set(1990, Calendar.OCTOBER, 17);

        pessoa.setNascimento(dataNascimento);

        pessoa.setTipoSanguineo("B+");

        Medicao medicao1 = new Medicao();
        medicao1.setPeso(72.4);
        medicao1.setAltura(1.75);

        Medicao medicao2 = new Medicao();
        medicao2.setPeso(75.4);
        medicao2.setAltura(1.75);

        pessoa.addMedicao(medicao1);
        pessoa.addMedicao(medicao2);

        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Cpf: "+pessoa.getCpf());
        System.out.println("Nascimento: "+pessoa.getNascimento());
        System.out.println("Idade: "+pessoa.getIdade());
        System.out.println("Tipo: "+pessoa.getTipoSanguineo());

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for(Medicao medicao : pessoa.getMedicao()){
            System.out.println("\nMedicao "+formatter.format(medicao.getDataHora().getTime())+":");
            System.out.println("Peso: "+medicao.getPeso());
            System.out.println("Altura: "+medicao.getAltura());
        }
    }
}
