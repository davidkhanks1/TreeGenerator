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
import org.gedcomx.common.json.*;
import org.gedcomx.conclusion.json.*;
import org.gedcomx.types.json.*;

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
    
    /**
     * Creates a person and puts them in the PersonCreator list of persons
     * @param givenName the given name of the person
     * @param surname the last or surname of the person
     * @param genType the gender of the person, Java Enum
     * @param changeMessage the message; this is currently implemented in a simple form as to not make the project unnecessarily complex for the time being
     * @param birthDate the date of the month of birth
     * @param birthMonth the month of birth
     * @param birthYear the year of birth
     * @return person object
     */
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
        List<NamePart> nameParts = new ArrayList();
        List<Name> names = new ArrayList();
        List<Fact> facts = new ArrayList();
        
        
        if (genType == "Male" || genType == "male" || genType == "M" || genType == "m") {
            gender.setType(GenderType.Male.toString());
            display.setGender(GenderType.Male.toString());
        } else if (genType == "Female" || genType == "female" || genType == "F" || genType == "f") {
            gender.setType(GenderType.Female.toString());
            display.setGender(GenderType.Female.toString());
        } else {
            gender.setType(GenderType.Unknown.toString());
            display.setGender(GenderType.Unknown.toString());
        }
        
        
        attr.setChangeMessage(changeMessage);
        
        name.setAttribution(attr);
        name.setType(NameType.BirthName.toString());
        
        nameForm.setFullText(returnFullName(givenName, surname));
        namePart1.setValue(givenName);
        namePart1.setType(NamePartType.Given.toString());
        namePart2.setValue(surname);
        namePart2.setType(NamePartType.Surname.toString());
        
        nameParts.add(namePart1);
        nameParts.add(namePart2);
        nameForm.setParts(nameParts);
        
        nameForms.add(nameForm);
        
        name.setNameForms(nameForms);
        names.add(name);
        createdPerson.setNames(names);

        
        fact1.setAttribution(attr);
        fact1.setType(FactType.Birth.toString());
        date1.setOriginal(birthDate + " " + birthMonth + " " + birthYear);
        date1.setFormal("+" + birthYear);
        place1.setOriginal("Moscow, Russia");
        fact1.setDate(date1);
        fact1.setPlace(place1);
        
        fact2.setAttribution(attr);
        fact2.setType(FactType.Residence.toString());
        date2.setOriginal(birthDate + " " + birthMonth + " " + birthYear);
        date2.setFormal("+1836-04-13");
        place2.setOriginal("Moscow, Russia");
        fact2.setDate(date2);
        fact2.setPlace(place2);
        
        facts.add(fact1);
        facts.add(fact2);
        
        createdPerson.setFacts(facts);
        
        display.setName(returnFullName(givenName, surname));
        
        display.setLifespan(birthDate + " " + birthMonth + " " + birthYear + " - Dead");
        display.setBirthDate(birthDate + " " + birthMonth + " " + birthYear);
        display.setBirthPlace("Moscow, Russia");
        
        createdPerson.setDisplayExtension(display);
        
        
        
        gender.setAttribution(attr);
        createdPerson.setGender(gender);
        
        
        
        getPersons().add(createdPerson);
        return createdPerson;
    }
    
    /**
     * Concatenates the first and last names to make the full name value less cluttered in the createPerson() method
     * @param first the first name
     * @param last the last name
     * @return fullName
     */
    private String returnFullName(String first, String last) {
        String fullName = first + " " + last;
        return fullName;
    }

    /** Returns the list of persons
     * @return the persons list
     */
    public List<Person> getPersons() {
        return persons;
    }
    
//    public Person getPerson(int index) {
//        return persons(index);
//    }
}
