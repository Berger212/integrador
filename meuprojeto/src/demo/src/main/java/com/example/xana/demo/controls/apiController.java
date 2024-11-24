package com.example.xana.demo.controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.xana.demo.models.Insumos;
import com.example.xana.demo.models.InsumosRepository;
import com.example.xana.demo.models.Receita;
import com.example.xana.demo.models.ReceitaRepository;
import com.example.xana.demo.models.Usuario;
import com.example.xana.demo.models.UsuarioRepository;

@RestController
@RequestMapping("/api")
public class apiController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private ReceitaRepository receitaRepository;
    @Autowired
    private InsumosRepository insumoRepository;
    @PostMapping("/enviar")
    public String receberDados(@RequestBody Usuario usuario) {
        System.out.println("Name: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Password: " + usuario.getSenha());

        usuarioRepository.save(usuario);
        return "Dados recebidos com sucesso!";
    }
    @PostMapping("/enviarinsumo")
    public String receberInsumos(@RequestBody Insumos insumo){
        System.out.println("Nome: " + insumo.getNome());
        System.out.println("Quantidade: " + insumo.getQuant());
        System.out.println("Preco: " + insumo.getPreco());

        insumoRepository.save(insumo);
        return "Dados recebidos com sucesso";
    }
    @PostMapping("/enviarreceita")
    public String receberReceita(@RequestBody Receita receita){
        System.out.println("Nome: " + receita.getNome());
        System.out.println("Quantidade: " + receita.getPorcoes());
        System.out.println("Preco: " + receita.getTempomedio());

        receitaRepository.save(receita);
        return "Dados recebidos com sucesso";
    }
    

    
}
