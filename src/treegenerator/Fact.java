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
public class Fact extends Conclusion{
    private boolean primary;
    private String type;
    private Date date;
    private PlaceReference place;
    private String value;
    private List<Qualifier> qualifiers;
    private List<Field> fields;
    
    public Fact() {
        
    }

    /**
     * @return the primary
     */
    public boolean isPrimary() {
        return primary;
    }

    /**
     * @param primary the primary to set
     */
    public void setPrimary(boolean primary) {
        this.primary = primary;
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
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the place
     */
    public PlaceReference getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(PlaceReference place) {
        this.place = place;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the qualifiers
     */
    public List<Qualifier> getQualifiers() {
        return qualifiers;
    }

    /**
     * @param qualifiers the qualifiers to set
     */
    public void setQualifiers(List<Qualifier> qualifiers) {
        this.qualifiers = qualifiers;
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
