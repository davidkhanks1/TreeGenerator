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
public enum ConfidenceLevel {
    HIGH("http://gedcomx.org/High"),MEDIUM("http://gedcomx.org/Medium"),LOW("http://gedcomx.org/Low");
    
    private String confidenceLevel;
    
    private ConfidenceLevel(String confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
    }
    
    public String getConfidenceLevel() {
        return confidenceLevel;
    }
}
