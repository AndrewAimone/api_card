package service.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.card.model.CardModel;
import service.card.repository.CardRepository;

import java.util.ArrayList;


@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/teste")
    public String teste(){
        return "OK FUNCIONANDO:";
    }

    @GetMapping("/buscar")
    public ArrayList<CardModel> buscarCards(){
        ArrayList<CardModel> lista;
        lista =  (ArrayList<CardModel>) cardRepository.findAll();
        return lista;
    }



}
