/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treegenerator;

/**
 *
 * @author davidkhanks
 */
public enum FieldValueType {
    ORIGINAL("http://gedcomx.org/Original"), INTERPRETED("http://gedcomx.org/Interpreted");
    
    private String fieldValueType;
    
    private FieldValueType(String fieldValueType) {
        this.fieldValueType = fieldValueType;
    }
    
    public String getFieldValueType() {
        return fieldValueType;
    }
}
