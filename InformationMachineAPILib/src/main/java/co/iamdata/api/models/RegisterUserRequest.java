/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RegisterUserRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5519555740104703016L;
    private String email;
    private String zip;
    private String userId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("zip")
    public String getZip ( ) { 
        return this.zip;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("zip")
    public void setZip (String value) { 
        this.zip = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("user_id")
    public String getUserId ( ) { 
        return this.userId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("user_id")
    public void setUserId (String value) { 
        this.userId = value;
    }
 
}
 