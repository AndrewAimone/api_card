package service.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.card.model.BodyModel;

@Repository
public interface BodyRepository extends JpaRepository<BodyModel,Integer> {
}
