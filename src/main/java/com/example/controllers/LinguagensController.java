/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controllers;

import com.example.modelos.Linguagem;
import com.example.servicos.LinguagensServico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lucas Araujo
 */

@RestController
public class LinguagensController {
    
    @Autowired
    private LinguagensServico linguagensServico;
    
    @RequestMapping("/linguagens")
    public List<Linguagem> getLinguagens() {
        return linguagensServico.getLinguagens();
    }
}
