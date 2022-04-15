package service.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.card.model.Teste;
import service.card.repository.CardRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/teste")
public class TesteController {
    @Autowired
    CardRepository cardRepository;

    @GetMapping("/listar")
    public ArrayList<Teste> testandometodo(){
        ArrayList<Teste> lista;
        lista = (ArrayList<Teste>) cardRepository.findAll();
        return  lista;
    }


}
