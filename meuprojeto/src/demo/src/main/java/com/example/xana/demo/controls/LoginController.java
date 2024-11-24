package com.example.xana.demo.controls;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.xana.demo.models.Usuario;
import com.example.xana.demo.models.UsuarioRepository;

@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest){
        Optional<Usuario> usuario = usuarioRepository.findByEmailAndSenha(loginRequest.getEmail(), loginRequest.getSenha());

        if (usuario.isPresent()){
            return ResponseEntity.ok("Login bem sucedido");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais inválidas");            
        }
    }
}
