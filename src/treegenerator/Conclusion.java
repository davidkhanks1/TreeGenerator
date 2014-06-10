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
public class Conclusion {
    private ConfidenceLevel confidenceLevel;
    private String lang;
    private Attribution attribution;

    /**
     * @return the confidenceLevel
     */
    public ConfidenceLevel getConfidenceLevel() {
        return confidenceLevel;
    }

    /**
     * @param confidenceLevel the confidenceLevel to set
     */
    public void setConfidenceLevel(ConfidenceLevel confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
    }
}
