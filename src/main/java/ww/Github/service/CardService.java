package ww.Github.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ww.Github.domain.Card;
import ww.Github.repository.CardRepository;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    public Page<Card> getAllCards(int page, int size) {
        return cardRepository.findAll(PageRequest.of(page, size));
    }

}
