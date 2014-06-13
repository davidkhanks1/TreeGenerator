/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treegenerator;

import java.util.Date;
import java.util.List;

/**
 *
 * @author davidkhanks
 */
public class Name extends Conclusion {
    private String type;
    private boolean preferred;
    private Date date;
    private List<NameForm> nameForms;
    
    public Name() {
        
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
     * @return the preferred
     */
    public boolean isPreferred() {
        return preferred;
    }

    /**
     * @param preferred the preferred to set
     */
    public void setPreferred(boolean preferred) {
        this.preferred = preferred;
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
     * @return the nameForms
     */
    public List<NameForm> getNameForms() {
        return nameForms;
    }

    /**
     * @param nameForms the nameForms to set
     */
    public void setNameForms(List<NameForm> nameForms) {
        this.nameForms = nameForms;
    }
    
}
