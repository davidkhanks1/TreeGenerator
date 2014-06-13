/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treegenerator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author davidkhanks
 */
public class Gender extends Conclusion {
    private GenderType type;
    private List<Field> fields = new ArrayList();
    
    public Gender(GenderType type) {
        this.type = type;
    }

    /**
     * @return the type
     */
    public GenderType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(GenderType type) {
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
}
