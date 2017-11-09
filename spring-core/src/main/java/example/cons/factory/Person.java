package example.cons.factory;

import example.Name;

public class Person {

    private Name personName;

    private Person(Name personName){
        this.personName = personName;
    }

    public static Person createPerson(Name personName){
        return new Person(personName);
    }

    public String getPersonName(){
        return personName.getName();
    }
}
