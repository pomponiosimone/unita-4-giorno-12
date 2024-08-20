package pomponiosimone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pomponiosimone.dao.EventoDao;

import static pomponiosimone.entities.TipoEvento.PRIVATO;
import static pomponiosimone.entities.TipoEvento.PUBBLICO;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("unita-4-giorno-12");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        EventoDao sd = new EventoDao(em);
//save
        evento geolier = new evento("Rock", "2024-05-10", "album", 40000, PUBBLICO);
        evento luke = new evento("Rap", "2023-10-10", "Disco Platino", 1000, PRIVATO);
        sd.save(geolier);
        sd.save(luke);
        em.close();
        emf.close();
    }
}
