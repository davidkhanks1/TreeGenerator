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
     * @return the sources
     */
    public List<SourceReference> getSources() {
        return sources;
    }

    /**
     * @param sources the sources to set
     */
    public void setSources(List<SourceReference> sources) {
        this.sources = sources;
    }

    /**
     * @return the analysis
     */
    public ResourceReference getAnalysis() {
        return analysis;
    }

    /**
     * @param analysis the analysis to set
     */
    public void setAnalysis(ResourceReference analysis) {
        this.analysis = analysis;
    }

    /**
     * @return the notes
     */
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
