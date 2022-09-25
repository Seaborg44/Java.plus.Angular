package ww.Github.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ww.Github.domain.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

}
