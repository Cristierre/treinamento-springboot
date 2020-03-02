package br.com.sicredi.treinamento.revendedora.controller;

import br.com.sicredi.treinamento.revendedora.service.MarcaService;
import br.com.sicredi.treinamento.revendedora_plus.model.Marca;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController// caso o @Controller seja usado deve ser acrescentado o @ResponseBody em cima de cada método
public class MarcaController {

    private MarcaService marcaService;

    public MarcaController(MarcaService marcaService){
        this.marcaService = marcaService;
    }


    @GetMapping(path="/marcas/{id}")
    public ResponseEntity<Marca> getMarca(@PathVariable("id") Long id){
        Marca marcaObtida = marcaService.getMarca(id);
        return ResponseEntity.ok(marcaObtida);
    }
}
