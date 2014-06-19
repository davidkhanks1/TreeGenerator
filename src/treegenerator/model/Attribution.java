/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treegenerator;

import java.util.Date;

/**
 *
 * @author davidkhanks
 */
public class Attribution extends ExtensibleData {
    private ResourceReference contributor;
    private Date modified;
    private String changeMessage;

    /**
     * @return the changeMessage
     */
    public String getChangeMessage() {
        return changeMessage;
    }

    /**
     * @param changeMessage the changeMessage to set
     */
    public void setChangeMessage(String changeMessage) {
        this.changeMessage = changeMessage;
    }
    
}
