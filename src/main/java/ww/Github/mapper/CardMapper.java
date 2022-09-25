package ww.Github.mapper;

import org.mapstruct.Mapper;
import ww.Github.domain.Card;
import ww.Github.service.dto.CardDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CardMapper {

    CardDto mapToDto (Card card);

    List<CardDto> mapToListDto (List<Card> cardList);


}
