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
public class Fact extends Conclusion{
    private boolean primary;
    private FactType type;
    private Date date;
    private PlaceReference place;
    private String value;
    private List<Qualifier> qualifiers;
    private List<Field> fields;
    
}
