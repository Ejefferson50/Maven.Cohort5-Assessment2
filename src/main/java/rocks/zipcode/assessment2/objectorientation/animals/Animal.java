package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;
import sun.jvm.hotspot.utilities.Assert;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal extends Person {
    Long id = getId();
    Person owner = new Person();
    Address address;

    public Animal() {
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
        this.id = id;
        this.owner = owner;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Address getAddress() {
        return this.address;
    }
}
