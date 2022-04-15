package service.card.model;

import javax.persistence.*;

@Entity
@Table(name="cards")
public class CardModel {

    @Id
    @GeneratedValue
    private int id_card;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="id_header")
//     private HeaderModel header;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_body_fk")
    private BodyModel body;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId_card() {
        return id_card;
    }

    public void setId_card(int id_card) {
        this.id_card = id_card;
    }

//    public HeaderModel getHeader() {
//        return header;
//    }
//
//    public void setHeader(HeaderModel header) {
//        this.header = header;
//    }

    public BodyModel getBody() {
        return body;
    }

    public void setBody(BodyModel body) {
        this.body = body;
    }
}
