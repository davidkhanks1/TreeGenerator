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
class Subject extends Conclusion{
    private boolean extracted;
    private List<EvidenceReference> evidence;
    private List<SourceReference> media;
    private List<Identifier> identifiers;

    /**
     * @return the extracted
     */
    public boolean isExtracted() {
        return extracted;
    }

    /**
     * @param extracted the extracted to set
     */
    public void setExtracted(boolean extracted) {
        this.extracted = extracted;
    }

    /**
     * @return the evidence
     */
    public List<EvidenceReference> getEvidence() {
        return evidence;
    }

    /**
     * @param evidence the evidence to set
     */
    public void setEvidence(List<EvidenceReference> evidence) {
        this.evidence = evidence;
    }

    /**
     * @return the media
     */
    public List<SourceReference> getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(List<SourceReference> media) {
        this.media = media;
    }

    /**
     * @return the identifiers
     */
    public List<Identifier> getIdentifiers() {
        return identifiers;
    }

    /**
     * @param identifiers the identifiers to set
     */
    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }
    
}
