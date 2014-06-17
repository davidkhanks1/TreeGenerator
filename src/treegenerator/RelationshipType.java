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
public enum RelationshipType {
    COUPLE("http://gedcomx.org/Couple"), PARENTCHILD("http://gedcomx.org/ParentChild");
    
    private String relationshipType;
    
    private RelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }
    
    public String getRelationshipType() {
        return relationshipType;
    }
    
}
