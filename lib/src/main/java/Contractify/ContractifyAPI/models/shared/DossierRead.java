/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DossierRead {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dossiertype_name")
    public String dossiertypeName;

    public DossierRead withDossiertypeName(String dossiertypeName) {
        this.dossiertypeName = dossiertypeName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Long id;

    public DossierRead withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public DossierRead withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("permalink")
    public String permalink;

    public DossierRead withPermalink(String permalink) {
        this.permalink = permalink;
        return this;
    }
    
    public DossierRead(){}
}
