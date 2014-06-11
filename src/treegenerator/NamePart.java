/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treegenerator;

import java.util.List;

/**
 *
 * @author davidkhanks
 */
class NamePart extends ExtensibleData{
    private String value;
    private NamePartType type;
    private List<Field> fields;
    private List<Qualifier> qualifiers;
}
