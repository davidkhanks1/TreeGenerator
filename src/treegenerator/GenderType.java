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
public enum GenderType {
    MALE("http://gedcomx.org/Male"),FEMALE("http://gedcomx.org/Female"), UNKOWN("http://gedcomx.org/Unknown");
    
    private String gender;
    
    private GenderType(String gender){
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    } 
    
}
