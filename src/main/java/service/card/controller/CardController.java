package service.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.card.model.CardModel;
import service.card.model.Teste;
import service.card.repository.CardRepository;

import javax.smartcardio.Card;
import java.util.ArrayList;


@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/teste")
    public String teste(){
        return "OK FUNCIONANDO:";
    }

    @GetMapping("/listar")
    public ArrayList<CardModel> testandometodo(){
        ArrayList<CardModel> lista;
        lista = (ArrayList<CardModel>) cardRepository.findAll();

        return  lista;
    }



}
