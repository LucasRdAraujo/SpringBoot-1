package br.com.infnet.pokecards.services;

import br.com.infnet.pokecards.models.DataCard;
import br.com.infnet.pokecards.models.DataCards;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(url="https://api.pokemontcg.io/v2/cards", name="PokeCardService")
public interface PokeCardService {
    @GetMapping("?page={number}") // https://api.pokemontcg.io/v2/cards?page=5
    DataCards getCards(@PathVariable("number") String number);
    
    @GetMapping("/{pokeid}") // https://api.pokemontcg.io/v2/cards/xy7-54
    DataCard getCardById(@PathVariable("pokeid") String pokeid);
}
