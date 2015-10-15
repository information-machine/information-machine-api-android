/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PurchaseItemProduct 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5339382953496385683L;
    private Integer categoryId;
    private Integer id;
    private String name;
    private String upc;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("category_id")
    public Integer getCategoryId ( ) { 
        return this.categoryId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("category_id")
    public void setCategoryId (Integer value) { 
        this.categoryId = value;
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
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("upc")
    public String getUpc ( ) { 
        return this.upc;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("upc")
    public void setUpc (String value) { 
        this.upc = value;
    }
 
}
 