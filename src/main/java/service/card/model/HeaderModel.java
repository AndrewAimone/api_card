package service.card.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="header")
public class HeaderModel {

    @Id
    @GeneratedValue
    private int id_head;

    private String title_head;
    private int rank_head;
    private String rarity_head;
    private String img_head;

    public int getId_head() {
        return id_head;
    }

    public void setId_head(int id_head) {
        this.id_head = id_head;
    }

    public String getTitle_head() {
        return title_head;
    }

    public void setTitle_head(String title_head) {
        this.title_head = title_head;
    }

    public int getRank_head() {
        return rank_head;
    }

    public void setRank_head(int rank_head) {
        this.rank_head = rank_head;
    }

    public String getRarity_head() {
        return rarity_head;
    }

    public void setRarity_head(String rarity_head) {
        this.rarity_head = rarity_head;
    }

    public String getImg_head() {
        return img_head;
    }

    public void setImg_head(String img_head) {
        this.img_head = img_head;
    }
}
