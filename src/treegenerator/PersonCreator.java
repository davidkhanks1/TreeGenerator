/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treegenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * This class maintains a list of person objects which can then be converted to JSON
 * @author David
 */
public class PersonCreator {
    
    private List<Person> persons = new ArrayList();
    
    /**
     * Constructor
     */
    public PersonCreator() {
        
    }
    

    public void createPerson(String givenName, String surname, String genType, String changeMessage) {
        Person createdPerson = new Person();
        Gender gender = new Gender();
        Attribution attr = new Attribution();
        Name name = new Name();
        NameForm nameForm = new NameForm();
        NamePart namePart1 = new NamePart();
        NamePart namePart2 = new NamePart();
        Fact fact1 = new Fact();
        Fact fact2 = new Fact();
        Date date1 = new Date();
        Date date2 = new Date();
        PlaceReference place1 = new PlaceReference();
        PlaceReference place2 = new PlaceReference();
        DisplayProperties display = new DisplayProperties();
        List<NameForm> nameForms = new ArrayList();
        
        
        if (genType == "Male" || genType == "male" || genType == "M" || genType == "m") {
            gender.setType(GenderType.MALE.getGender());
        } else if (genType == "Female" || genType == "female" || genType == "F" || genType == "f") {
            gender.setType(GenderType.FEMALE.getGender());
        } else {
            gender.setType(GenderType.UNKOWN.getGender());
        }
        
        
        attr.setChangeMessage(changeMessage);
        
        name.setAttribution(attr);
        name.setType(NameType.BIRTHNAME.getNameType());
        
        nameForm.setFullText("Anastasia Aleksandrova");
        namePart1.setValue("Anastasia");
        namePart1.setType(NamePartType.GIVEN.getNamePartType());
        namePart2.setValue("Aleksandrova");
        namePart2.setType(NamePartType.SURNAME.getNamePartType());
        
        nameForm.addNamePart(namePart1);
        nameForm.addNamePart(namePart2);
        
        nameForms.add(nameForm);
        
        name.setNameForms(nameForms);
        createdPerson.addName(name);
        
        fact1.setAttribution(attr);
        fact1.setType(FactType.BIRTH.getFactType());
        date1.setOriginal("3 Apr 1836");
        date1.setFormal("+1836");
        place1.setOriginal("Moscow, Russia");
        fact1.setDate(date1);
        fact1.setPlace(place1);
        
        fact2.setAttribution(attr);
        fact2.setType(FactType.RESIDENCE.getFactType());
        date2.setOriginal("13 Apr 1836");
        date2.setFormal("+1836-04-13");
        place2.setOriginal("Moscow, Russia");
        fact2.setDate(date2);
        fact2.setPlace(place2);
        
        createdPerson.addFact(fact1);
        createdPerson.addFact(fact2);
        
        display.setName("Anastasia Aleksandrova");
        display.setGender("Female");
        display.setLifespan("3 Apr 1836 - Dead");
        display.setBirthDate("3 Apr 1836");
        display.setBirthPlace("Moscow, Russia");
        
        createdPerson.setDisplay(display);
        
        
        
        gender.setAttribution(attr);
        createdPerson.setGender(gender);
        
        
        
        persons.add(createdPerson);
    }
}
