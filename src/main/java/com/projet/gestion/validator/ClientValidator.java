package com.projet.gestion.validator;


import com.projet.gestion.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {

    public List<String> errors(ClientDto clientDto){

        List<String> errors = new ArrayList<>();

        if(clientDto == null){
            errors.add("veuillez renseigner le nom du client");
            errors.add("veuillez renseigner le prenom du client");
            errors.add("veuillez renseigner le mail du client");
            errors.add("veuillez renseigner le numero de telephone du client");
            return errors ;
        }

        if ( !StringUtils.hasLength(clientDto.getNom())){
            errors.add("veuillez renseigner le nom du client");
        }
        if ( !StringUtils.hasLength(clientDto.getPrenom())){
            errors.add("veuillez renseigner le prenom du client");
        }
        if ( !StringUtils.hasLength(clientDto.getNom())){
            errors.add("veuillez renseigner le nom du client");
        }
        if ( !StringUtils.hasLength(clientDto.getMail())){
            errors.add("veuillez renseigner le mail du client");
        }
        if ( !StringUtils.hasLength(clientDto.getNumeroTelephone())){
            errors.add("veuillez renseigner le numero de telephone du client");
        }
        return  errors ;
    }

}

