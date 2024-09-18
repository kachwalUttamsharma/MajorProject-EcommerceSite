package org.example.productcatalogservice.tableinheritanceexamples.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name="st_ta")
@DiscriminatorValue(value ="1")
public class Ta extends User {
    private Integer ratings;
}
