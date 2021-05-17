package br.com.infnet.pokecards;

import br.com.infnet.pokecards.models.DataCard;
import br.com.infnet.pokecards.models.DataCards;
import br.com.infnet.pokecards.services.PokeCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableFeignClients
@Controller
public class HomeController {

    @Autowired
    private PokeCardService pokeCardService;
    
    @RequestMapping("/")
    public String home(Model model) {
        DataCards data = pokeCardService.getCards("1");
        model.addAttribute("cards", data.getData());
        return "home";
    }

    @GetMapping("/pokemon/{id}")
    public String pokemon(@PathVariable String id, Model model) {
        DataCard data = pokeCardService.getCardById(id);
        model.addAttribute("card", data.getData());
        return "pokemon";
    }

}
