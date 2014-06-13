/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treegenerator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidkhanks
 */
public class Person extends Subject{
    private boolean principal;
    private boolean isPrivate; 
    private Gender gender;
    private List<Name> names = new ArrayList();
    private List<Fact> facts = new ArrayList();
    private DisplayProperties display;
    
    /**
     * Constructor
     * @param firstName the firstName to set
     * @param lastName the lastName to set
     */
    public Person() {
        
    }

    /**
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * @return the names
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * @param names the names to set
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }
    
    public void addName(Name name) {
        names.add(name);
    }
    
    public void addFact(Fact fact) {
        getFacts().add(fact);
    }

    /**
     * @return the principal
     */
    public boolean isPrincipal() {
        return principal;
    }

    /**
     * @param principal the principal to set
     */
    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }

    /**
     * @return the isPrivate
     */
    public boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * @param isPrivate the isPrivate to set
     */
    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     * @return the facts
     */
    public List<Fact> getFacts() {
        return facts;
    }

    /**
     * @param facts the facts to set
     */
    public void setFacts(List<Fact> facts) {
        this.facts = facts;
    }

    /**
     * @return the display
     */
    public DisplayProperties getDisplay() {
        return display;
    }

    /**
     * @param display the display to set
     */
    public void setDisplay(DisplayProperties display) {
        this.display = display;
    }
    


    
}
