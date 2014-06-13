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
class NameForm extends ExtensibleData{
    private String lang;
    private String fullText;
    private List<NamePart> parts = new ArrayList();
    private List<Field> fields;

    /**
     * @return the lang
     */
    public String getLang() {
        return lang;
    }

    /**
     * @param lang the lang to set
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * @return the fullText
     */
    public String getFullText() {
        return fullText;
    }

    /**
     * @param fullText the fullText to set
     */
    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    /**
     * @return the parts
     */
    public List<NamePart> getParts() {
        return parts;
    }

    /**
     * @param parts the parts to set
     */
    public void setParts(List<NamePart> parts) {
        this.parts = parts;
    }
    
    public void addNamePart(NamePart np) {
        this.parts.add(np);
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
