package teste;

import model.Pessoa;
import util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.Calendar;

public class TestaHibernate {
    public static void main(String[] args) {

        EntityManager entityManager = JPAUtil.getEntityManager();

        Pessoa p1 = new Pessoa();

        p1.setNome("Joao");
        p1.setSexo("M");
        p1.setCpf("70338996290");
        p1.setTipoSanguineo("B-");

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(2000, Calendar.OCTOBER, 17);
        p1.setNascimento(dataNascimento);

        entityManager.getTransaction().begin();
        entityManager.persist(p1);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
