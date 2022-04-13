package service.card.dto;

import service.card.model.BodyModel;
import service.card.model.HeaderModel;

public class CardDto {

    private HeaderModel id_header;
    private BodyModel id_body;

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
