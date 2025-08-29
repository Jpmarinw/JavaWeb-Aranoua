package teste;

import model.Medicao;
import util.JPAUtil;

import javax.persistence.EntityManager;

public class TestaHibernateMedicao {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtil.getEntityManager();

        Medicao medicao1 = new Medicao();

        medicao1.setPeso(72.4);
        medicao1.setAltura(175);

        entityManager.getTransaction().begin();
        entityManager.persist(medicao1);
        entityManager.getTransaction().commit();

    }
}
