package ww.Github.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ww.Github.domain.Card;
import ww.Github.service.CardService;


@RestController
@RequestMapping("/")
public class AppController {

    @Autowired
    CardService cardService;

    @GetMapping("/allCards")
    public Page<Card> getAllCards(@RequestParam("page") int page,
                                  @RequestParam("size") int size) {
        return cardService.getAllCards(page, size);
    }

}
