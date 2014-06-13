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
class NamePart extends ExtensibleData{
    private String value;
    private String type;
    private List<Field> fields;
    private List<Qualifier> qualifiers;

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
}
