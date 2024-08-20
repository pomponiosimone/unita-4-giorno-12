package pomponiosimone.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import pomponiosimone.evento;

public class EventoDao {
    private final EntityManager em;

    public EventoDao(EntityManager em) {
        this.em = em;
    }

    //SAVE
    public void save(evento evento) {
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(evento);

        transaction.commit();
        System.out.println("lo Studente" + evento.getTitolo + "è stato salvato correttamente");
    }

}
