package com.casamento.convite.controller;

import com.casamento.convite.model.Convidado;
import com.casamento.convite.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConviteController {

    @Autowired
    private ConvidadoRepository repository;

    @GetMapping("/")
    public String exibirConvite(Model model) {
        model.addAttribute("convidado", new Convidado());
        return "index"; 
    }

    @PostMapping("/confirmar")
    public String confirmarPresenca(Convidado convidado, Model model) {
        repository.save(convidado);
        model.addAttribute("mensagem", "Presença confirmada com sucesso! Mal podemos esperar para celebrar com você.");
        model.addAttribute("convidado", new Convidado()); 
        return "index"; 
    }

    // NOVA ROTA: Cria o caminho para a página de presentes
    @GetMapping("/presentes")
    public String exibirPresentes() {
        return "presentes"; 
    }
}