/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ConnectUserStoreResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4950695320452855008L;
    private String createdAt;
    private String credentialsStatus;
    private Integer id;
    private String scrapeStatus;
    private String storeName;
    private String type;
    private String updatedAt;
    private UserData user;
    private String username;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_at")
    public String getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_at")
    public void setCreatedAt (String value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("credentials_status")
    public String getCredentialsStatus ( ) { 
        return this.credentialsStatus;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("credentials_status")
    public void setCredentialsStatus (String value) { 
        this.credentialsStatus = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public Integer getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (Integer value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("scrape_status")
    public String getScrapeStatus ( ) { 
        return this.scrapeStatus;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("scrape_status")
    public void setScrapeStatus (String value) { 
        this.scrapeStatus = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("store_name")
    public String getStoreName ( ) { 
        return this.storeName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("store_name")
    public void setStoreName (String value) { 
        this.storeName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt (String value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("user")
    public UserData getUser ( ) { 
        return this.user;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("user")
    public void setUser (UserData value) { 
        this.user = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("username")
    public String getUsername ( ) { 
        return this.username;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("username")
    public void setUsername (String value) { 
        this.username = value;
    }
 
}
 