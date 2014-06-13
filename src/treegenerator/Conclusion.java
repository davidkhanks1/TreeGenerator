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
public class Conclusion extends HypermediaEnabledData {
    private ConfidenceLevel confidenceLevel;
    private String lang;
    private Attribution attribution;
    private List<SourceReference> sources;
    private ResourceReference analysis;
    private List<Note> notes;

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

    /**
     * @return the attribution
     */
    public Attribution getAttribution() {
        return attribution;
    }

    /**
     * @param attribution the attribution to set
     */
    public void setAttribution(Attribution attribution) {
        this.attribution = attribution;
    }
}
