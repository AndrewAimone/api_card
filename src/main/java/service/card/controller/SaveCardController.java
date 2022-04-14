package service.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.card.model.CardModel;
import service.card.repository.CardRepository;

@RestController
@RequestMapping("cards")
public class SaveCardController {

    @Autowired
    CardRepository cardRepository;
    CardModel cardModel;
//    @PostMapping("/salvar")
//    public ResponseEntity<CardModel> teste(@RequestBody CardModel cardModel){
//        return ResponseEntity.ok().body(cardRepository.save(cardModel));
//    }
}
