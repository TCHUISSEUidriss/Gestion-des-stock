package com.projet.gestion.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projet.gestion.model.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {

    private Integer id ;

    private String nom;

    private String prenom ;

    private String photo ;

    // ce champ est un champ composé ; il va etre definir dans plusieurs classes
    private AdresseDto adresse ;

    private String mail;

    private String numeroTelephone ;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients ;

    public static ClientDto fromEntity(Client client){
        if (client == null){
            // TODO throw on exception
            return null ;
        }

         return ClientDto.builder()
                 .id(client.getId())
                 .nom(client.getNom())
                 .prenom(client.getPrenom())
                 .photo(client.getPhoto())
                 .adresse(AdresseDto.fromEntity(client.getAdresse()))
                 .mail(client.getMail())
                 .numeroTelephone(client.getNumeroTelephone())
                 .build() ;
    }


    public static Client toEntity (ClientDto clientDto){
        if (clientDto == null){
            //TODO throw on exception
            return  null ;
        }

        Client client = new Client();

        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setPhoto(clientDto.getPhoto());
        client.setAdresse(AdresseDto.toEntity(clientDto.getAdresse()));
        client.setMail(clientDto.getMail());
        client.setNumeroTelephone((clientDto.getNumeroTelephone()));

        return client ;

    }
}
