package jpabook.jpashop.domain.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@DiscriminatorValue("B")
@Getter
@Setter
@Entity
public class Book extends Item {

    private String author;
    private String isbn;
}
