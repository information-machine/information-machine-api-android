/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ExecuteCart 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5165082258877356329L;
    private String checkoutUrl;
    private String message;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("checkout_url")
    public String getCheckoutUrl ( ) { 
        return this.checkoutUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("checkout_url")
    public void setCheckoutUrl (String value) { 
        this.checkoutUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
    }
 
}
 