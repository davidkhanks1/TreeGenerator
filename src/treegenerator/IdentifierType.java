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
public enum IdentifierType {
    PRIMARY("http://gedcomx.org/Primary"), EVIDENCE("http://gedcomx.org/Evidence"), 
    DEPRECATED("http://gedcomx.org/Deprecated"), PERSISTENT("http://gedcomx.org/Persistent");
    
    private String identifierType;
    
    private IdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }
    
    public String getIdentifierType() {
        return identifierType;
    }
    
}
