package br.com.sicredi.treinamento.revendedora.controller;

import br.com.sicredi.treinamento.revendedora_plus.model.Marca;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarcaController {

    @GetMapping(path="/marcas/{id}")
    public ResponseEntity<Marca> getMarca(Long id){
        Marca marca = new Marca();

        marca.setId(id);
        marca.setNome("Avenue Code");

        return ResponseEntity.ok(marca);
    }
}
