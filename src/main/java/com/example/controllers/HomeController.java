/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controllers;

import com.example.htmlfy.*;
import com.example.htmlfy.models.Attribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        String html = "<!DOCTYPE html>" + new Html(
                new Attribute[] { new Attribute("lang", "pt-br") },
                new Head(
                        new Meta(false, new Attribute("charset", "UTF-8")).create(),
                        new Meta(false, new Attribute("http-equiv", "X-UA-Compatible"), new Attribute("content", "IE=edge")).create(),
                        new Meta(false, new Attribute("name", "viewport"), new Attribute("content", "width=device-width, initial-scale=1.0")).create(),
                        new Link(false,
                            new Attribute("href", "https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css"), 
                            new Attribute("rel", "stylesheet"), 
                            new Attribute("integrity", "sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0"),
                            new Attribute("crossorigin", "anonymous")
                        ).create(),
                        new Script(
                            new Attribute("src", "https://kit.fontawesome.com/154afaa558.js"),
                            new Attribute("crossorigin", "anonymous")
                        ).create(),
                        new Title("Meu curriculo").create()
                ).create(),
                new Body(
                        new Div(
                                new Attribute[] { new Attribute("class", "container") },
                                new Div(
                                        new Attribute[] { new Attribute("class", "row") },
                                        new Div(
                                                new Attribute[] { new Attribute("class", "col-md p-4") },
                                                new Table(
                                                    new Attribute[] { new Attribute("cellspacing", "20") },
                                                    new Tr(
                                                            new Td(
                                                                    new Img(new Attribute("src", "https://pbs.twimg.com/profile_images/1160657428494655490/H6029Pp1.jpg"),new Attribute("style", "width: 10em;clip-path: cicle();")).create()
                                                            ).create(),
                                                            new Td(
                                                                    new Hx(2,"Lucas Araujo").create(),
                                                                    new P("Cursando análise e desenvolvimento de sistemas no Instituto Infnet.").create(),
                                                                    new P("Buscando uma oportunidade de estágio como desenvolvedor fullstack.").create()
                                                            ).create()
                                                    ).create()
                                                ).create()
                                        ).create()
                                ).create(),
                                new Div(
                                        new Attribute[] { new Attribute("class", "row") },
                                        new Div(
                                                new Attribute[] { new Attribute("class", "col-md p-4") },
                                                new Hx(2, "Skills").create(),
                                                new Table(
                                                        new Attribute[] { new Attribute("cellspacing", "20") },
                                                        new Tr(
                                                                new Td("Javascript").create(),
                                                                new Td(
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create()
                                                                ).create()
                                                        ).create(),
                                                        new Tr(
                                                                new Td("Python").create(),
                                                                new Td(
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create()
                                                                ).create()
                                                        ).create(),
                                                        new Tr(
                                                                new Td("Java").create(),
                                                                new Td(
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create()
                                                                ).create()
                                                        ).create(),
                                                        new Tr(
                                                                new Td("Csharp").create(),
                                                                new Td(
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create()
                                                                ).create()
                                                        ).create(),
                                                        new Tr(
                                                                new Td("Kotlin").create(),
                                                                new Td(
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create(),
                                                                        new I(new Attribute("class", "fas fa-star")).create()
                                                                ).create()
                                                        ).create()
                                                ).create()
                                        ).create()
                                ).create(),
                                new Div(
                                        new Attribute[] { new Attribute("class", "row") },
                                        new Div(
                                                new Attribute[] { new Attribute("class", "col-md p-4") },
                                                new Hx(2, "Contato").create(),
                                                new P(new I(new Attribute("class", "fas fa-phone")).create(), " (21)9999999999").create(),
                                                new P(new I(new Attribute("class", "fas fa-envelope")).create(), " araujo.lucasrosa@gmail.com").create()
                                        ).create()
                                ).create(),
                                new Footer(
                                        new Hx(2, "Fim da página").create()
                                ).create()
                        ).create()
                ).create()
        ).create();
        return html;
    }
}
