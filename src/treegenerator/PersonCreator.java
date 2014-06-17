/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treegenerator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * This class maintains a list of person objects which can then be converted to JSON
 * @author David
 */
public class PersonCreator {
    private LinkedHashMap monthMap = new LinkedHashMap();
    
    
    private List<Person> persons = new ArrayList();
    
    /**
     * Constructor
     */
    public PersonCreator() {
        monthMap.put("Jan", "01");
    }
    

    public Person createPerson(String givenName, String surname, String genType, String changeMessage, String birthDate, String birthMonth, String birthYear) {
        
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
            display.setGender(GenderType.MALE.getGender());
        } else if (genType == "Female" || genType == "female" || genType == "F" || genType == "f") {
            gender.setType(GenderType.FEMALE.getGender());
            display.setGender(GenderType.FEMALE.getGender());
        } else {
            gender.setType(GenderType.UNKOWN.getGender());
            display.setGender(GenderType.UNKOWN.getGender());
        }
        
        
        attr.setChangeMessage(changeMessage);
        
        name.setAttribution(attr);
        name.setType(NameType.BIRTHNAME.getNameType());
        
        nameForm.setFullText(returnFullName(givenName, surname));
        namePart1.setValue(givenName);
        namePart1.setType(NamePartType.GIVEN.getNamePartType());
        namePart2.setValue(surname);
        namePart2.setType(NamePartType.SURNAME.getNamePartType());
        
        nameForm.addNamePart(namePart1);
        nameForm.addNamePart(namePart2);
        
        nameForms.add(nameForm);
        
        name.setNameForms(nameForms);
        createdPerson.addName(name);
        
        fact1.setAttribution(attr);
        fact1.setType(FactType.BIRTH.getFactType());
        date1.setOriginal(birthDate + " " + birthMonth + " " + birthYear);
        date1.setFormal("+" + birthYear);
        place1.setOriginal("Moscow, Russia");
        fact1.setDate(date1);
        fact1.setPlace(place1);
        
        fact2.setAttribution(attr);
        fact2.setType(FactType.RESIDENCE.getFactType());
        date2.setOriginal(birthDate + " " + birthMonth + " " + birthYear);
        date2.setFormal("+1836-04-13");
        place2.setOriginal("Moscow, Russia");
        fact2.setDate(date2);
        fact2.setPlace(place2);
        
        createdPerson.addFact(fact1);
        createdPerson.addFact(fact2);
        
        display.setName(returnFullName(givenName, surname));
        
        display.setLifespan(birthDate + " " + birthMonth + " " + birthYear + " - Dead");
        display.setBirthDate(birthDate + " " + birthMonth + " " + birthYear);
        display.setBirthPlace("Moscow, Russia");
        
        createdPerson.setDisplay(display);
        
        
        
        gender.setAttribution(attr);
        createdPerson.setGender(gender);
        
        
        
        getPersons().add(createdPerson);
        return createdPerson;
    }
    
    public String returnFullName(String first, String last) {
        String fullName = first + " " + last;
        return fullName;
    }

    /**
     * @return the persons
     */
    public List<Person> getPersons() {
        return persons;
    }
    
//    public Person getPerson(int index) {
//        return persons(index);
//    }
}
