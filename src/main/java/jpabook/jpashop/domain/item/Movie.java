package jpabook.jpashop.domain.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@DiscriminatorValue("M")
@Getter
@Setter
@Entity
public class Movie extends Item {

    private String director;
    private String actor;

}
