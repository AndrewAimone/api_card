package service.card.model;

import javax.persistence.*;

@Entity
@Table(name= "teste")
public class Teste {

    @Id
    @GeneratedValue
    private int id;

    private String nome;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="bodyfk")
    private BodyModel bodyfk;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
