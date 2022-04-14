package service.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.card.model.Teste;
import service.card.repository.CardRepository;

import java.util.List;

@RestController
public class TesteController {
    @Autowired
    CardRepository cardRepository;

    @GetMapping("/teste")
    public ResponseEntity<List<Teste>> testandometodo(){
        return  ResponseEntity.ok(cardRepository.findAll());
    }

}
