package br.fatecrl.mvc.controllers;

import br.fatecrl.mvc.models.Alunos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/alunos")
public class alunosController {

    // simula banco de dados
    private static final List<Alunos> alunos = new ArrayList<Alunos>();


    public alunosController() {
        alunos.add (new Alunos("111111", "Ana", 10, 5));
        alunos.add (new Alunos("222222", "Yasmin", 9, 9));
        alunos.add (new Alunos("333333", "Amanda", 8, 4));
        alunos.add (new Alunos("444444", "Rhayadh", 10, 8));
        alunos.add (new Alunos("555555", "Vitor", 8, 8));
        alunos.add (new Alunos("666666", "Michel", 7, 10));


    }
    @GetMapping
    public String getAlunos(Model model){
        model.addAttribute("alunos", alunos);
        return "alunos";

    }
}
