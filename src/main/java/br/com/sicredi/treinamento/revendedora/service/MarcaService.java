package br.com.sicredi.treinamento.revendedora.service;

import br.com.sicredi.treinamento.revendedora_plus.model.Marca;
import org.springframework.stereotype.Service;

@Service
public class MarcaService {

    public Marca getMarca(Long id){
        Marca marca = new Marca();
        marca.setId(id);
        marca.setNome("Avenue Code");

        return marca;
    }
}
