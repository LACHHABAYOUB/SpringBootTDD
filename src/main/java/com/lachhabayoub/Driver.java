package com.lachhabayoub;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor // generates a constructor with 1 parameter for each field in this class
@NoArgsConstructor //allows us to generates a private no-args constructors and an additional static factory method that wraps around the private constructor is generated.
@Data //Generates getters and setters for all fields
@Builder //useful mechanism for using the Builder pattern without writing boilerplate code
@Entity //that the class is an entity and is mapped to a database table

public class Driver {

    @Id //Specifies the primary key of an entity
    @GeneratedValue //for the specification of generation strategies for the values of primary keys
    private long id;
    private String name;
    private String ssn;
    private boolean active=false;
}
