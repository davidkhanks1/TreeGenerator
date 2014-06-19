/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treegenerator;

import java.util.List;

/**
 *
 * @author davidkhanks
 */
public class Relationship extends Subject{
    private String type;
    private ResourceReference person1;
    private ResourceReference person2;
    private List<Fact> facts;
    private List<Field> fields;
    
    public Relationship() {
        
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the person1
     */
    public ResourceReference getPerson1() {
        return person1;
    }

    /**
     * @param person1 the person1 to set
     */
    public void setPerson1(ResourceReference person1) {
        this.person1 = person1;
    }

    /**
     * @return the person2
     */
    public ResourceReference getPerson2() {
        return person2;
    }

    /**
     * @param person2 the person2 to set
     */
    public void setPerson2(ResourceReference person2) {
        this.person2 = person2;
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
     * @return the fields
     */
    public List<Field> getFields() {
        return fields;
    }

    /**
     * @param fields the fields to set
     */
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
