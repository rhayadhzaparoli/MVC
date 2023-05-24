package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvc.models.Alunos;
import br.fatecrl.mvcdemo.models.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunosApiController {


    private static final List<Alunos> alunos = new ArrayList<Alunos>();

    public AlunosApiController() {
        alunos.add (new Alunos("111111", "Ana", 10, 5));
        alunos.add (new Alunos("222222", "Yasmin", 9, 9));
        alunos.add (new Alunos("333333", "Amanda", 8, 4));
        alunos.add (new Alunos("444444", "Rhayadh", 10, 8));
        alunos.add (new Alunos("555555", "Vitor", 8, 8));
        alunos.add (new Alunos("666666", "Michel", 7, 10));
    }

    @GetMapping
    public List<Alunos> getAlunos(){
        return alunos;
    }

}