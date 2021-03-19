package com.projet.gestion.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projet.gestion.model.Category;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategoryDto {

    private Integer id ;

    private String code ;

    private String designation ;

    @JsonIgnore
    private List<ArticlesDto> articles ;


    public  CategoryDto fromEntity(Category category){
        if (category == null) {
            // TODO throw on exception
            return null ;
        }
        // mappin de category vers ategoryDto
        return CategoryDto.builder()
                .id(category.getId())
                .designation(category.getDesignation())
                .code(category.getCode())
                .build() ;

    }

    public Category toEntity(CategoryDto categoryDto){
        if(categoryDto == null ){
            // TODO throw on exception
            return null ;
        }
        // mappin de CategoryDto vers Category
        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());

        return  category ;

    }

}
