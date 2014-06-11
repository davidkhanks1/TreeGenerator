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
public enum NamePartType {
    PREFIX("http://gedcomx.org/Prefix"), SUFFIX("http://gedcomx.org/Suffix"), 
    GIVEN("http://gedcomx.org/Given"), SURNAME("http://gedcomx.org/Surname");
    
    private String namePartType;
    
    private NamePartType(String namePartType) {
        this.namePartType = namePartType;
    }
    
    public String getNamePartType() {
        return namePartType;
    }
}
