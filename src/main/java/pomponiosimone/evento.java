package pomponiosimone;

import jakarta.persistence.*;

@Entity
@Table(name = "evento")
public class evento {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "titolo")
    private String titolo;
    @Column(name = "data_evento")
    private String dataEvento;
    @Column(name = "descrizione")
    private String descrizione;
    @Column(name = "numero_massimo_partecipanti")
    private Integer numeroMassimoPartecipanti;
//constructor

    public evento(long id, String titolom) {
        this.id = id;
    }


    // getter and setter

    public Integer getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;


    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public long getId() {
        return id;
    }
}
