package jpabook.jpashop.domain.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@DiscriminatorValue("A")
@Getter
@Setter
@Entity
public class Album extends Item {

    private String artist;
    private String etc;
}
