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
class PlaceReference extends ExtensibleData{
    private String description;
    private String original;
    private List<TextValue> normalized;
    private List<Field> fields;
    
    public PlaceReference() {
        
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the original
     */
    public String getOriginal() {
        return original;
    }

    /**
     * @param original the original to set
     */
    public void setOriginal(String original) {
        this.original = original;
    }

    /**
     * @return the normalized
     */
    public List<TextValue> getNormalized() {
        return normalized;
    }

    /**
     * @param normalized the normalized to set
     */
    public void setNormalized(List<TextValue> normalized) {
        this.normalized = normalized;
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
