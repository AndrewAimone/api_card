package service.card.model;

import javax.persistence.*;

@Entity
@Table(name="body")
public class BodyModel {

    @Id
    @GeneratedValue
    private int id_body;

    private String name_ability;
    private String specs_ability;
    private String effects_ability;
    private int damage_ability;

    public int getId_body() {
        return id_body;
    }

    public void setId_body(int id_body) {
        this.id_body = id_body;
    }

    public String getName_ability() {
        return name_ability;
    }

    public void setName_ability(String name_ability) {
        this.name_ability = name_ability;
    }

    public String getSpecs_ability() {
        return specs_ability;
    }

    public void setSpecs_ability(String specs_ability) {
        this.specs_ability = specs_ability;
    }

    public String getEffects_ability() {
        return effects_ability;
    }

    public void setEffects_ability(String effects_ability) {
        this.effects_ability = effects_ability;
    }

    public int getDamage_ability() {
        return damage_ability;
    }

    public void setDamage_ability(int damage_ability) {
        this.damage_ability = damage_ability;
    }
}
