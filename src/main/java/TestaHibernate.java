import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaHibernate {
    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Banco01PU");

        EntityManager entityManager = fabrica.createEntityManager();

        Pessoa p1 = new Pessoa();

        p1.setNome("Joao");
        p1.setSexo("M");
        p1.setCpf("70338996290");
        p1.setTipoSanguineo("B-");

        entityManager.getTransaction().begin();
        entityManager.persist(p1);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
