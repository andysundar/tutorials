package example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 *  This test confirms the dependency injection in various format.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class PersonBeanTest {

    private static final String PERSON_NAME = "Testing Panda";

    @Autowired
    private example.cons.Person consPerson;

    @Autowired
    private example.cons.factory.Person factoryConsPerson;

    @Autowired
    private example.setter.Person setterPerson;

    @Autowired
    private example.setter.factory.Person factorySetterPerson;


    @Test
    public void testConsPerson(){
        assertNotNull(consPerson);
        assertEquals(PERSON_NAME, consPerson.getPersonName());
    }

    @Test
    public void testFactoryConsBean(){
        assertNotNull(factoryConsPerson);
        assertEquals(PERSON_NAME, factoryConsPerson.getPersonName());
    }

    @Test
    public void testSetterPerson(){
        assertNotNull(setterPerson);
        assertEquals(PERSON_NAME, setterPerson.getPersonName().getName());
    }

    @Test
    public void testFactorySetterBean(){
        assertNotNull(factorySetterPerson);
        assertEquals(PERSON_NAME, factorySetterPerson.getPersonName().getName());
    }
}