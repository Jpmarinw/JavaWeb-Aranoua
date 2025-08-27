public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Joao");
        p1.setSexo("M");
        p1.setCpf("70338996290");
        p1.setTipoSanguineo("B-");

        System.out.println("Nome: "+p1.getNome());
        System.out.println("Sexo: "+p1.getSexo());
        System.out.println("CPF: "+p1.getCpf());
        System.out.println("Tipo Sanguineo: "+p1.getTipoSanguineo());
    }
}
