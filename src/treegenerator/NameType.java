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
public enum NameType {
    BIRTHNAME("http://gedcomx.org/BirthName"), DEATHNAME("http://gedcomx.org/DeathName"), MARRIEDNAME("http://gedcomx.org/MarriedName"), ALSOKNOWNAS("http://gedcomx.org/AlsoKnownAs"), 
    NICKNAME("http://gedcomx.org/NickName"), ADOPTIVENAME("http://gedcomx.org/AdoptiveName"), FORMALNAME("http://gedcomx.org/FormalName"), RELIGIOUSNAME("http://gedcomx.org/ReligiousName");
    
    private String nameType;
    
    private NameType(String nameType) {
        this.nameType = nameType;
    }
    
    public String getNameType() {
        return nameType;
    }
    
}
