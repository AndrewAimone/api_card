package service.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.card.model.CardModel;
import service.card.repository.CardRepository;

import java.util.List;


@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/buscar")
    public List<CardModel> buscarCards(){
        return cardRepository.findAll();
    }

    @PostMapping("/salvar")
    public ResponseEntity<CardModel> salvarCards(RequestBody CardModel){

    }


}
