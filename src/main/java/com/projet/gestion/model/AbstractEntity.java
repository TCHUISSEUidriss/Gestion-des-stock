package com.projet.gestion.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class) // ecoute la classe et met a jour de facon automatique creatDate et LastModificationDate
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id ;

    @CreatedDate
    @Column(name = "creationDate" ,nullable = false)
    @JsonIgnore
    private Instant creationDate ;

    @LastModifiedDate
    @Column(name = "lastModifieDate")
    @JsonIgnore
    private Instant lastModifieDate ;



}
