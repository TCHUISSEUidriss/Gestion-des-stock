package com.projet.gestion.handlers;

import com.projet.gestion.exception.ErrorCodes;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorDto  {

    private Integer httpCode ;

    private ErrorCodes errorCodes ;

    private String message ;

    private List<String> errors = new ArrayList<>() ;

}
