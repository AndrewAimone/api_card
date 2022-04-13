package service.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.card.model.CardModel;

@Repository
public interface CardRepository extends JpaRepository<CardModel, Integer> {

}
