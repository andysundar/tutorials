package example.cons;

import example.Name;

public class Person {

    private Name personName;

    public Person(Name personName){
        this.personName = personName;
    }

    public String getPersonName(){
        return personName.getName();
    }
}
