package example.setter;

import example.Name;

public class Person {

    private Name personName;


    public Name getPersonName() {
        return personName;
    }

    public void setPersonName(Name personName) {
        this.personName = personName;
    }
}
