/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.servicos;

import com.example.modelos.Linguagem;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucas Araujo
 */

@Service
public class LinguagensServico {
    private List<Linguagem> linguagens = Arrays.asList(
            new Linguagem(1, "Javascript", "*****"),
            new Linguagem(2, "Python", "***"),
            new Linguagem(3, "Java", "****"),
            new Linguagem(4, "Csharp", "*****"),
            new Linguagem(5, "Kotlin", "***")
    );
    
    public List<Linguagem> getLinguagens() {
        return linguagens;
    }
}
