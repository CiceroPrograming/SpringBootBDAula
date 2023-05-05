package com.br.javawebbd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.br.javawebbd.Model.Aluno;
import com.br.javawebbd.Repository.AlunoRepository;

@Controller
public class AlunoController {

    @Autowired
    AlunoRepository repository;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/home")
    public String salvar(Aluno aluno) {
        repository.save(aluno);
        return "";
    }
}
