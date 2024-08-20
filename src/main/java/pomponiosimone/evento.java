package pomponiosimone;

import jakarta.persistence.*;
import pomponiosimone.entities.TipoEvento;

@Entity
@Table(name = "evento")
public class evento {
    public String getTitolo;
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
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_evento")
    private TipoEvento tipoEvento;

    //constructor
    public evento() {
    }

    public evento(String titolo, TipoEvento tipoEvento) {

        this.titolo = titolo;
        this.tipoEvento = tipoEvento;
    }

    public evento(String titolo, String dataEvento, String descrizione, Integer numeroMassimoPartecipanti, TipoEvento tipoEvento) {

        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        this.tipoEvento = tipoEvento;
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

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
}

