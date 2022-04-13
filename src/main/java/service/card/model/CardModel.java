package service.card.model;

import javax.persistence.*;

@Entity
@Table(name="cards")
public class CardModel {

    @Id
    @GeneratedValue
   private int id_card;

    @ManyToOne
    @JoinColumn(name="id_header")
   private HeaderModel id_header;

    @ManyToOne
    @JoinColumn(name="id_body")
   private BodyModel id_body;

    public int getId_card() {
        return id_card;
    }

    public void setId_card(int id_card) {
        this.id_card = id_card;
    }

    public HeaderModel getId_header() {
        return id_header;
    }

    public void setId_header(HeaderModel id_header) {
        this.id_header = id_header;
    }

    public BodyModel getId_body() {
        return id_body;
    }

    public void setId_body(BodyModel id_body) {
        this.id_body = id_body;
    }
}
