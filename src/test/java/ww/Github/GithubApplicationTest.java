package ww.Github;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import ww.Github.domain.Card;
import ww.Github.mapper.CardMapper;
import ww.Github.repository.CardRepository;
import ww.Github.service.CardService;
import ww.Github.service.dto.CardDto;

import java.util.List;


@SpringBootTest
class GithubApplicationTest {

    @Autowired
    CardRepository cardRepository;

    @Autowired
    CardService cardService;

    @Autowired
    CardMapper cardMapper;

    @Test
    void testFetchCard() {
        Card foundPlainCard = cardRepository.findById(1241l).get();
        CardDto foundCard = cardMapper.mapToDto(cardRepository.findById(1241l).get());

        System.out.println(foundCard);
    }

    @Test
    void shouldMapToDtoList() {
        List<CardDto> cardDtoList = cardMapper.mapToListDto(cardRepository.findAll());

        System.out.println(cardDtoList.size());
    }

    @Test
    void shouldGetPageCard() {
        Page<Card> ww = cardService.getAllCards(1,50);
        System.out.println(ww);
    }
}