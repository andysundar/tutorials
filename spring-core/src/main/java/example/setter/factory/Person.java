package example.setter.factory;

import example.Name;

public class Person {

    private Name personName;

    private Person(){

    }

    public static Person createPerson(){
        return new Person();
    }


    public Name getPersonName() {
        return personName;
    }

    public void setPersonName(Name personName) {
        this.personName = personName;
    }
}
