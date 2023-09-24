package com.easyadmin.easyadmin.specifications;

import org.springframework.data.jpa.domain.Specification;

import com.easyadmin.easyadmin.models.Categoria;
import com.easyadmin.easyadmin.models.Produto;

import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;

public class SpecificationTemplate {
    
    @And({
        @Spec(path = "nome", spec = LikeIgnoreCase.class),
        @Spec(path = "descricao", spec = LikeIgnoreCase.class),
    })
    public interface ProdutoSpec extends Specification<Produto>{}

    @And({
        @Spec(path = "nome", spec = LikeIgnoreCase.class)
    })
    public interface Categoriapec extends Specification<Categoria>{}
}
