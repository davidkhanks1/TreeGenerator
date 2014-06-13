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
    private List<Name> names;
    private List<Fact> facts;
    private DisplayProperties display;
    
    /**
     * Constructor
     * @param firstName the firstName to set
     * @param lastName the lastName to set
     */
    public Person() {
        
    }
    
    public void addGender(GenderType sex) {
        Gender gender = new Gender(sex);
    }

    
}
