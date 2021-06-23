package learn.jpa.factories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceFactory {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("pure-jpa");

    private PersistenceFactory() {
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}